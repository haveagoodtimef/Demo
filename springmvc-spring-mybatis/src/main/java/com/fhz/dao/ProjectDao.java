package com.fhz.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fhz.entity.Project;


/**
 * 此接口对象为一个数据访问对象(关联一个mapper)
 * 所在层:DAL(数据访问层)
 * 因为在配置未见中,指定了mapper的路径,所有此处不用加@Repository
 */

public interface ProjectDao {
	/**
	 * 查询项目信息
	 */
	public Project  findObjects();
}
