package com.manager.login.service;

import com.project.object.managers;

public interface managerOperate {
	/**
	 * 管理员登录
	 * 
	 * @param managers
	 * @return managers
	 * @author zhouhui
	 * */
	public managers managerLogin(managers m);
	
	/**
	 * 管理员注册
	 * 
	 * @param managers
	 * @return managers
	 * @author zhouhui
	 * */
	public managers managerRegist(managers m);
	
	/**
	 * 修改管理员的状态（删除,恢复）
	 * 
	 * @param managers
	 * @return int  受影响的行数
	 * @author zhouhui
	 * */
	public int managerChageStatus(managers m);
	
}
