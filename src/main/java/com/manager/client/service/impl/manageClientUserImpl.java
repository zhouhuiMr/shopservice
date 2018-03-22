package com.manager.client.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.manager.client.service.manageClientUser;
import com.manager.client.service.mapper.clientuserMapper;
import com.project.object.clientUser;

@Service(
		version="1.0.0",
		interfaceName="manageClientUser",
		application = "${dubbo.application.id}",
		protocol = "${dubbo.protocol.id}",
		registry = "${dubbo.registry.id}"
		)
public class manageClientUserImpl implements manageClientUser{
	
	@Autowired
	private clientuserMapper manageClientUserDao;

	@Override
	public ArrayList<clientUser> getClientUserList(int column, int curpage, String colname, String condition) {
		if(column < 0 || column > 40) {
			return null;
		}else if(curpage <= 0) {
			return null;
		}else if(colname == null || condition == null) {
			return null;
		}else {
			int startcolumn = column*(curpage-1);
			ArrayList<clientUser> list = manageClientUserDao.getUserByCondition(startcolumn, column, colname, condition);
			return list;
		}
	}

	@Override
	public int getClientUserCount(String condition) {
		if(condition != null) {
			int pageNum = manageClientUserDao.getPageCount(condition);
			return pageNum;
		}else {
			return -1;
		}
	}

	@Override
	public int chageClientUserStatus(clientUser user) {
		if(user != null) {
			int status = user.getStatus();
			if(status != 0 || status != 1) {
				return -1;
			}
			int row = manageClientUserDao.changeClientStatus(user.getId(), status);
			return row;
		}else {
			return -1;
		}
	}
}
