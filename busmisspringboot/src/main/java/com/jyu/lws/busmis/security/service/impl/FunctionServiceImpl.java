package com.jyu.lws.busmis.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jyu.lws.busmis.security.dao.IFunctionDao;
import com.jyu.lws.busmis.security.model.FunctionModel;
import com.jyu.lws.busmis.security.service.IFunctionService;

@Service("FunctionService")
@Transactional(rollbackFor = Exception.class)
public class FunctionServiceImpl implements IFunctionService {
@Autowired
IFunctionDao functionDao=null;
	@Override
	public void create(FunctionModel function) throws Exception {
		functionDao.create(function);
	}

	@Override
	public void delete(FunctionModel function) throws Exception {
		functionDao.delete(function);
	}

	@Override
	public void update(FunctionModel function) throws Exception {
		functionDao.update(function);
	}

	@Override
	@Transactional(readOnly = true)
	public List<FunctionModel> selectListByAll() throws Exception {
		List<FunctionModel> list=functionDao.selectListByAll();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public List<FunctionModel> selectListByAllWithModuleByNestedSelect() throws Exception {
		List<FunctionModel> list=functionDao.selectListByAllWithNestedSelect();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public List<FunctionModel> selectListByAllWithModuleByNestedResultMap() throws Exception {
		List<FunctionModel> list=functionDao.selectListByAllWithNestedResultMap();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public List<FunctionModel> selectListByModule(int moduleNo) throws Exception {
		List<FunctionModel> list=functionDao.selectListByModuleNo(moduleNo);
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public FunctionModel selectByNo(int no) throws Exception {
		FunctionModel functionModel=functionDao.selcectByNo(no);
		return functionModel;
	}

	@Override
	@Transactional(readOnly = true)
	public int selectCountByAll() throws Exception {
		int count=functionDao.selectCountByAll();
		return count;
	}

	@Override
	@Transactional(readOnly = true)
	public int selectCountByModule(int moduleNo) throws Exception {
		int count=functionDao.selectCountByModuleNo(moduleNo);
		return count;
	}

}
