package com.api.interfaces.wjm.workflow.mapper;

import com.api.interfaces.wjm.workflow.controller.ProjectReqVO;
import com.api.interfaces.wjm.workflow.dal.project.ProjectDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/*
    @author  TY
    @description 
    @create 2024 12 2024/12/27 16:28
*/
public interface ProjectMapper extends BaseMapper<ProjectDO> {

	ProjectDO getProject( ProjectReqVO projectReqVO);
}
