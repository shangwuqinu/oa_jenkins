package com.api.interfaces.wjm.workflow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface JenkinsConfigRepository extends JpaRepository<JenkinsConfig, Long> {

    // 根据 keyName 查询对应的值
    JenkinsConfig findByJenkinsToken(String jenkinsToken);
}
@Repository
interface JenkinsProjectsRepository extends JpaRepository<JenkinsConfig, Long> {
    @Query("SELECT j.jenkinsToken FROM JenkinsConfig j ")
    List<String> findAllJenkinsTokens();
}