package com.jyu.lws.busmis.security.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jyu.lws.busmis.security.dao.IUserDao;
import com.jyu.lws.busmis.security.model.ModuleModel;
import com.jyu.lws.busmis.security.model.UserModel;
import com.jyu.lws.busmis.security.service.IUserService;


@Service("UserService")
@Transactional(rollbackFor=Exception.class)
public class UserServiceImpl implements IUserService {
	UserModel um=null;
@Autowired
	private IUserDao userDao=null;
	//修改密码
	@Override
	public void changePassword(String id, String password) throws Exception {
		um=userDao.selectById(id);
		um.setPassword(password);
		userDao.update(um);
	}
    //修改角色
	@Override
	public void changeRole(String id, String role) throws Exception {
		UserModel um = userDao.selectById(id);
		um.setRole(role);
		userDao.update(um);
	}
    //验证用户合法性
	@Override
	public boolean validate(String id, String password) throws Exception {
		boolean result =false;
		um = userDao.selectById(id);
		if(um!=null&&um.getPassword()!=null&&um.getPassword().equals(password)) {
			result = true;
		}
		return result;
	}
    //激活用户
	@Override
	public void active(String id) throws Exception {
		um = userDao.selectById(id);
		um.setStatus("Y");
		userDao.update(um);
	}
    //终止用户
	@Override
	public void disable(String id) throws Exception {
	    um = userDao.selectById(id);
		um.setStatus("N");
		userDao.update(um);
	}
	//增加用户
	@Override
	public void register(UserModel userModel) throws Exception {
		userDao.create(userModel);
	}
    //删除用户
	@Override
	public void delete(UserModel userModel) throws Exception {
		userDao.delete(userModel);
	}
	//修改用户
	@Override
	public void modify(UserModel userModel) throws Exception {
		userDao.update(userModel);
	}
	//查询用户(查询所有用户)
	@Override
	@Transactional(readOnly = true)
	public List<UserModel> getListByAll() throws Exception {
		List<UserModel> list=userDao.selectListByAll();
		return list;
	}
    //查询用户(根据ID查询用户，返回单个用户)
	@Override
	@Transactional(readOnly = true)
	public UserModel selectById(String id) throws Exception {
		UserModel um=userDao.selectById(id);
		return um;
	}
	@Override
	//分页 rows：每屏显示的个数， page:页号
	public List<UserModel> getListByAllWithPage(int page,int rows) throws Exception {
		List<UserModel> list=userDao.selectListByAllWithPage(rows*(page-1), rows);
		return list;
	}
	//增加角色
	@Override
	public void addRoles(String userId, int[] roleNos) throws Exception {
		//每次增加角色前，推荐把原有的角色删除
		userDao.deleteRoles(userId);
		//再增加新的角色
	    userDao.addRoles(userId, roleNos);
	}
	//取的指定用户的模块列表
	@Override
	@Transactional(readOnly = true)
	public List<ModuleModel> getModuleListByUser(String userid) throws Exception {
		List<ModuleModel> list=userDao.getModuleListByUser(userid);
		return list;
	}
	//根据指定的参数返回用户列表
	@Override
	@Transactional(readOnly = true)
	public List<UserModel> getListByCondition(int roleNo, String keyName, int minAge, int maxAge, Date startDate,
			Date endDate) throws Exception {
		if(keyName!=null&&keyName.trim().length()>0) {
			keyName="%"+keyName+"%";
		}
		List<UserModel> list=userDao.selectListByCondition(roleNo, keyName, minAge, maxAge, startDate, endDate);
		return list;
	}
	
}
