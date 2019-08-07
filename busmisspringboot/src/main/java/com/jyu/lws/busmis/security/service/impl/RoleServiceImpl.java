package com.jyu.lws.busmis.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jyu.lws.busmis.security.dao.IRoleDao;
import com.jyu.lws.busmis.security.model.RoleModel;
import com.jyu.lws.busmis.security.service.IRoleService;

@Service("RoleService")
@Transactional(rollbackFor = Exception.class)
public class RoleServiceImpl implements IRoleService {
	@Autowired
	IRoleDao roleDao=null;
	@Override
	public void add(RoleModel role) throws Exception {
		roleDao.create(role);
	}

	@Override
	public void delete(RoleModel role) throws Exception {
		roleDao.delete(role);
	}

	@Override
	public void modify(RoleModel role) throws Exception {
		roleDao.update(role);
	}

	@Override
	@Transactional(readOnly = true)
	public List<RoleModel> getListByAll() throws Exception {
		List<RoleModel> list=roleDao.selectListByAll();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public RoleModel selectByNo(int no) throws Exception {
		RoleModel role=roleDao.selectByNo(no);
		return role;
	}

	@Override
	@Transactional(readOnly = true)
	public List<RoleModel> getListByUser(String userid) throws Exception {
		List<RoleModel>list=roleDao.getListByUser(userid);
		return list;
	}
	
}
