package com.jyu.lws.busmis.security.service;

import java.util.List;

import com.jyu.lws.busmis.security.model.ModuleModel;


public interface IModuleService {
	public void add(ModuleModel module) throws Exception;
	public void delete(ModuleModel module) throws Exception;
	public void modify(ModuleModel module) throws Exception;
	//取得所有模块列表，不取得关联的功能列表
	public List<ModuleModel> getListByAll() throws Exception;
	//取得模块列表，并取得关联的功能属性列表，使用内嵌式select方式
	public List<ModuleModel> getselectListByAllWithFunctionsByNestedSelect() throws Exception;
	//取得模块列表，并取得关联的功能属性列表，使用内嵌式ResultMap方式
	public List<ModuleModel> getselectListByAllWithFunctionsByNestedResultMap() throws Exception;
	//取得模块列表，并取得关联的角色属性列表，使用内嵌式select方式
	public List<ModuleModel> getListByAllWithRolesByNestedSelect() throws Exception;
	//取得模块列表，并取得关联的角色属性列表，使用内嵌式ResultMap方式
	public List<ModuleModel> getListByAllWithRolesByNestedResultMap() throws Exception;
	//取得模块列表，并取得关联的功能和角色属性列表，使用内嵌式select方式
	public List<ModuleModel> getListByAllWithFunctionsAndRolesFunctionByNestedSelect() throws Exception;
	//取得模块列表，并取得关联的功能和角色属性列表，使用内嵌式ResultMap方式
	public List<ModuleModel> getListByAllWithFunctionsAndRolesFunctionsByNestedResultMap() throws Exception;
	//通过模块ID取得模块列表
	public ModuleModel getByNo(int no) throws Exception;
	//取得所有模块的个数
	public int getCountByAll() throws Exception;
	//取得指定角色的模块列表
	public List<ModuleModel> getListByRole(String role) throws Exception;
	//验证指定角色是否有此模块权限: 参数：模块编号，角色编号
	public boolean checkAccessForRole(int moduleNo,int roleNo) throws Exception;
	
}
