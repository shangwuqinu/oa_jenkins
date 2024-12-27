package com.api.interfaces.wjm.workflow;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OaService {


    @Value("${jenkins.url}")
    private String jenkinsUrl;



    private final RestTemplate restTemplate;

    private final JenkinsConfigRepository jenkinsConfigRepository;
    private final JenkinsProjectsRepository jenkinsProjectsRepository;

    public OaService(RestTemplate restTemplate, JenkinsConfigRepository jenkinsConfigRepository,
                     JenkinsProjectsRepository jenkinsProjectsRepository,
                     @Value("${jenkins.url}") String jenkinsUrl) {
        this.restTemplate = restTemplate;
        this.jenkinsConfigRepository = jenkinsConfigRepository;  // 初始化仓库
        this.jenkinsProjectsRepository = jenkinsProjectsRepository;
        this.jenkinsUrl = jenkinsUrl;
    }
   // public OaService(RestTemplate restTemplate) {
   //     this.restTemplate = restTemplate;
    //}





    public void triggerJenkinsBuild(String projectId) {
        JenkinsConfig config = jenkinsConfigRepository.findByJenkinsToken("JENKINS_PROJECT_ID");
        String jenkinsProjectId = config != null ? config.getJenkinsToken() : "DEFAULT_PROJECT_ID";
        String jenkinsApiUrl = jenkinsUrl + "/job/"+jenkinsProjectId+"/buildWithParameters?token=" + jenkinsProjectId;
        restTemplate.postForEntity(jenkinsApiUrl, null, String.class);
    }

    public String[] getProjectFromDB() {
        List<String> jenkinsTokens = jenkinsProjectsRepository.findAllJenkinsTokens(); // 从 Repository 获取数据
        return jenkinsTokens.toArray(new String[0]); // 转换为 String 数组
    }
}
