package com.jyu.lws.busmis.security.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jyu.lws.busmis.security.model.RoleModel;

@Mapper
public interface IRoleDao {
	    //增加角色
		public void create(RoleModel role)throws Exception;
		//删除角色
		public void delete(RoleModel role)throws Exception;
		//修改角色
		public void update(RoleModel role)throws Exception;
		//查询所有角色
		public List<RoleModel> selectListByAll() throws Exception;
		//取得指定的角色
		public RoleModel selectByNo(int no) throws Exception;
		//取得指定模块的角色列表
		public List<RoleModel> getListByModule(int moduleNo) throws Exception;
		//取得指定用户的角色列表
		public List<RoleModel> getListByUser(String userid) throws Exception;
		//取得所有角色的个数
		public int selectCountByAll() throws Exception; 
}
