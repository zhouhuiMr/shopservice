package com.manager.client.service;

import java.util.ArrayList;

import com.project.object.clientUser;

public interface manageClientUser {
	/**
	 * 获取用户的信息列表
	 * 
	 * @param int 每页显示的行数
	 * @param int 当前的页数
	 * @param String 排序的列名称
	 * @param String 查询的条件
	 * 
	 * @return ArrayList<clientUser>
	 * 
	 * @author zhouhui
	 * */
	public ArrayList<clientUser> getClientUserList(int column, int curpage, String colname, String condition);
	
	/**
	 * 获取用户列表的总人数
	 * 
	 * @param String  查询的条件
	 * 
	 * @return int 返回总行数
	 * 
	 * @author zhouhui
	 * */
	public int getClientUserCount(String condition);
	
	/**
	 * 修改用户的状态（停用或者使用）
	 * 
	 * @param clientUser
	 * 
	 * @return int 受影响的行数
	 * 
	 * @author zhouhui
	 * */
	public int chageClientUserStatus(clientUser user);
}
