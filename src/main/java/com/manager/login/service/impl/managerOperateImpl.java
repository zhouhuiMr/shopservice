package com.manager.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.manager.login.service.managerOperate;
import com.manager.login.service.mapper.managerOperateMapper;
import com.project.object.managers;

@Service(
		version="1.0.0",
		interfaceName="managerOperate",
		application = "${dubbo.application.id}",
		protocol = "${dubbo.protocol.id}",
		registry = "${dubbo.registry.id}"
		)
public class managerOperateImpl implements managerOperate{
	@Autowired 
	managerOperateMapper managerDao;

	@Override
	public managers managerLogin(managers m) {
		if(m != null) {
			managers managers = managerDao.managersLogin(m.getUsername(), m.getPassword());
			return managers;
		}else {
			return null;
		}
	}

	@Override
	public managers managerRegist(managers m) {
		return null;
	}

	@Override
	public int managerChageStatus(managers m) {
		return 0;
	}

}
