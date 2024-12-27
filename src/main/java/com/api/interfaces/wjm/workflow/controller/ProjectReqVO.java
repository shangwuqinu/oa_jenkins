package com.api.interfaces.wjm.workflow.controller;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    @author  TY
    @description 
    @create 2024 12 2024/12/27 16:43

    查询 project VO

*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectReqVO {

	@TableId
	private Long id;

	/**
	 * 项目名称
	 */
	private String projectName;
}
