package com.manager.login.service.mapper;

import org.apache.ibatis.annotations.Param;

import com.project.object.managers;


public interface managerOperateMapper {
	
	public managers managersLogin(@Param("username") String username,@Param("password") String password);
}
