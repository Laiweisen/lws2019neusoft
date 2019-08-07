package com.jyu.lws.busmis.security.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jyu.lws.busmis.security.model.FunctionModel;


@Mapper
public interface IFunctionDao {
	//增加功能
	public void create(FunctionModel function) throws Exception;
	//删除功能
	public void delete(FunctionModel function) throws Exception;
	//修改功能
	public void update(FunctionModel function) throws Exception;
    //查询功能，取得所有系统功能列表，不取关联的模块对象
	public List<FunctionModel> selectListByAll() throws Exception;
	//查询功能，用内嵌式Select模式取关联的模块对象
	public List<FunctionModel> selectListByAllWithNestedSelect() throws Exception;
	//查询功能，用内嵌式ResultMap模式取关联的模块对象
	public List<FunctionModel> selectListByAllWithNestedResultMap() throws Exception;
	//查询功能，取得指定的系统功能对象
	public FunctionModel selcectByNo(int no)throws Exception;
	//查询功能，取得指定模块系统功能列表，参数：moduleNo 模块编号
	public List<FunctionModel> selectListByModuleNo(int moduleNo) throws Exception;
	//查询功能，取得所有功能的个数
	public int selectCountByAll() throws Exception;
	//查询功能，取得指定模块的功能的个数，参数moduleNo 模块编号
	public int selectCountByModuleNo(int moduleNo) throws Exception;

}
