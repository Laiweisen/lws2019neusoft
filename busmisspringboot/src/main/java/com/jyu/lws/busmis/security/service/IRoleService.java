package com.jyu.lws.busmis.security.service;

import java.util.List;

import com.jyu.lws.busmis.security.model.RoleModel;

public interface IRoleService {
	//增加角色
	public void add(RoleModel role) throws Exception;
	//删除角色
	public void delete(RoleModel role) throws Exception;
	//修改角色
	public void modify(RoleModel role) throws Exception;
	//查询所有角色
	public List<RoleModel> getListByAll() throws Exception;
	//根据用户no查询角色
	public RoleModel selectByNo(int no)throws Exception;
	//取得指定用户的角色列表
	public List<RoleModel> getListByUser(String userid) throws Exception;
	
}
