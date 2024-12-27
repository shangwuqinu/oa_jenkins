package com.api.interfaces.wjm.workflow.service;

/*
    @author  TY
    @description 
    @create 2024 12 2024/12/27 16:58
*/

import com.api.interfaces.wjm.workflow.controller.ProjectReqVO;
import com.api.interfaces.wjm.workflow.dal.project.ProjectDO;
import com.api.interfaces.wjm.workflow.mapper.ProjectMapper;
import jakarta.annotation.Resource;

public class ProjectServiceImpl {
	@Resource
	private ProjectMapper projectMapper;

	/**
	 * 根据项目名查询路径
	 * @param projectName
	 * @return
	 */
	public ProjectDO getProjectByName(String projectName) {
		ProjectReqVO projectReqVO = new ProjectReqVO();
		projectReqVO.setProjectName(projectName);

		// 传递 ProjectReqVO 作为参数
		return projectMapper.getProject(projectReqVO);
	}
}
