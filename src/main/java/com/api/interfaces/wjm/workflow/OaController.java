package com.api.interfaces.wjm.workflow;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OaController {

    private final OaService oaService;

    public OaController(OaService oaService) {
        this.oaService = oaService;
    }

    @GetMapping("/projects")
    public String[] getProjects() {
        return oaService.getProjectFromDB();
    }
    public String loadIndexPage(Model model) {
        String[] projects =oaService.getProjectFromDB(); // 调用 Service 方法
        model.addAttribute("projects", projects); // 将数据传递到前端
        return "index";
    }

        @PostMapping("/trigger-build")
    public String triggerBuild(@RequestParam String projectId) {
        oaService.triggerJenkinsBuild(projectId);
        return "Build triggered for project " + projectId;
    }
}
