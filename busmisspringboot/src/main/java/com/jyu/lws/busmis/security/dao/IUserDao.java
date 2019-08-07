package com.jyu.lws.busmis.security.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jyu.lws.busmis.security.model.ModuleModel;
import com.jyu.lws.busmis.security.model.RoleModel;
import com.jyu.lws.busmis.security.model.UserModel;


//用户的Dao层接口
@Mapper
public interface IUserDao {
    //C方法 create
	public void create(UserModel userModel) throws Exception;
	//U方法 update
	public void update(UserModel userModel) throws Exception;
	//D方法 delete
	public void delete(UserModel userModel) throws Exception;
    //R方法 查询所有用户，不取关联用户
	public List<UserModel> selectListByAll() throws Exception;
	//R方法 查询用户列表. 只取得用户的信息，取得用户关联的角色列表
	public List<UserModel> selectListByAllWithRoles() throws Exception;
	//分页   start开始页数   rows:取得个数
	public List<UserModel> selectListByAllWithPage(@Param("start")int start,@Param("rows")int rows) throws Exception;
	//查询用户列表，通过使用用户ID
	public UserModel selectById(String id) throws Exception;
	
	//为用户增加角色
	//每次增加一个角色
	public void addRole(@Param("id") String id, @Param("roleNo") int roleNo) throws Exception;
	//每次增加多个角色
	public void addRoles(@Param("id") String id, @Param("roleNoList")  int[] roleNoList) throws Exception;
	//删除指定用户的所有角色
	public void deleteRoles(String id) throws Exception;
	
	//取得指定用户的角色列表
	public List<RoleModel> getRoleListByUser(String userid) throws Exception;
	//判断指定的用户是否有指定的角色,取得用户和角色关联的个数
	public int selectCountByUserAndRoles(@Param("id") String id, @Param("roleNo") int roleNo) throws Exception;
	//取得指定用户授予的模块列表
	public List<ModuleModel> getModuleListByUser(String userid) throws Exception;
	//按检索条件取得用的列表:按照给定的参数检索用户列表：
	//int类型参数如果是0，不考虑此参数； 其他类型如果是空 ，空串或Null，则不考虑此删除
	public List<UserModel> selectListByCondition(@Param("roleNo") int roleNo,@Param("key") String keyName,@Param("min") int minAge,@Param("max") int maxAge,@Param("start") Date startDate,@Param("end") Date endDate) throws Exception;

}