package com.jyu.lws.busmis.security.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jyu.lws.busmis.security.model.ModuleModel;


@Mapper
public interface IModuleDao {
	//增加模块
	public void create(ModuleModel module) throws Exception;
	//删除模块
	public void delete(ModuleModel module) throws Exception;
	//修改模块
	public void update(ModuleModel module) throws Exception;
	//查询模块列表，不取得关联的功能列表
	public List<ModuleModel> selectListByAll() throws Exception;
	//查询模块列表，并取得关联的功能列表
	public List<ModuleModel> selectListByAllWithFunctions() throws Exception;
	//查询模块列表，并取得关联的功能列表，通过内嵌式Select方式
	public List<ModuleModel> selectListByAllWithFunctionsByNestedSelect() throws Exception;
	//查询模块列表，并取得关联的功能列表，通过内嵌式ResultMap方式
	public List<ModuleModel> selectListByAllWithFunctionsByNestedResultMap() throws Exception;
	//查询模块列表，并取得关联的角色列表，使用内嵌式Select方式
	public List<ModuleModel> selectListByAllWithRolesByNestedSelect() throws Exception;
	//查询模块列表，并取得关联的角色列表，使用内嵌式ResultMap方式
	public List<ModuleModel> selectListByAllWithRolesByNestedResultMap() throws Exception;
	//查询模块列表，并取得关联的功能和角色属性列表，使用内嵌式select方式
    public List<ModuleModel> selectListByAllWithFunctionsAndRolesFunctionByNestedSelect() throws Exception;
	//查询模块列表，并取得关联的功能和角色属性列表，使用内嵌式ResultMap方式
	public List<ModuleModel> selectListByAllWithFunctionsAndRolesFunctionsByNestedResultMap() throws Exception;
	//查询模块列表，通过模块ID
	public ModuleModel selectByNo(int no) throws Exception;
	//查询模块列表，通过模块ID取得功能列表
	public ModuleModel selectByNoWithFunctions(int no) throws Exception;
	//查询模块列表，通过模块ID取得角色列表
	public ModuleModel selectByNoWithRoles(int no) throws Exception;
	//查询模块列表，取得指定功能的模块列表
	public List<ModuleModel> selectListByFunction(String function) throws Exception;
	//查询模块列表，取得指定角色的模块列表
	public List<ModuleModel> selectListByRole(String role) throws Exception;
	//查询模块列表，取得所有模块的个数
	public int selectCountByAll() throws Exception;
	//取得指定模块和角色的关联个数，用于业务层检查此角色是否对此模块有权限
	public int selectCountByModuleNoAndRoleNo(int moduleNo,int roleNo) throws Exception;
}
