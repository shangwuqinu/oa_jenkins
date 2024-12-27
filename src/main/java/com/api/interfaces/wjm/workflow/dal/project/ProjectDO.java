package com.api.interfaces.wjm.workflow.dal.project;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    @author  TY
    @description 
    @create 2024 12 2024/12/27 16:10
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDO {

	@TableId
	private Long id;

	/**
	 * 项目加载路径
	 */
	private String projectLoad;

	/**
	 * 项目名称
	 */
	private String projectName;
}
