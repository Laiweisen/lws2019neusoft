package com.jyu.lws.busmis.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jyu.lws.busmis.security.dao.IModuleDao;
import com.jyu.lws.busmis.security.model.ModuleModel;
import com.jyu.lws.busmis.security.service.IModuleService;

@Service("ModuleService")
@Transactional(rollbackFor = Exception.class)
public class ModuleServiceImpl implements IModuleService {
    @Autowired
    IModuleDao moduleDao=null;
	@Override
	public void add(ModuleModel module) throws Exception {
		moduleDao.create(module);
	}

	@Override
	public void delete(ModuleModel module) throws Exception {
		moduleDao.delete(module);
	}

	@Override
	public void modify(ModuleModel module) throws Exception {
		moduleDao.update(module);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ModuleModel> getListByAll() throws Exception {
		List<ModuleModel> list=moduleDao.selectListByAll();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public ModuleModel getByNo(int no) throws Exception {
		ModuleModel moduleModel=moduleDao.selectByNo(no);
		return moduleModel;
	}

	@Override
	@Transactional(readOnly = true)
	public int getCountByAll() throws Exception {
		int count=moduleDao.selectCountByAll();
		return count;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ModuleModel> getListByRole(String role) throws Exception {
		List<ModuleModel> list=moduleDao.selectListByRole(role);
		return list;
		
	}

	@Override
	@Transactional(readOnly = true)
	public boolean checkAccessForRole(int moduleNo, int roleNo) throws Exception {
		int count=moduleDao.selectCountByModuleNoAndRoleNo(moduleNo, roleNo);
		if(count>0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<ModuleModel> getListByAllWithRolesByNestedResultMap() throws Exception {
		List<ModuleModel> list=moduleDao.selectListByAllWithRolesByNestedResultMap();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ModuleModel> getselectListByAllWithFunctionsByNestedSelect() throws Exception {
		List<ModuleModel> list=moduleDao.selectListByAllWithRolesByNestedSelect();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ModuleModel> getselectListByAllWithFunctionsByNestedResultMap() throws Exception {
		List<ModuleModel> list=moduleDao.selectListByAllWithFunctionsByNestedResultMap();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ModuleModel> getListByAllWithRolesByNestedSelect() throws Exception {
		List<ModuleModel> list=moduleDao.selectListByAllWithFunctionsByNestedSelect();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ModuleModel> getListByAllWithFunctionsAndRolesFunctionByNestedSelect() throws Exception {
		List<ModuleModel> list=moduleDao.selectListByAllWithFunctionsAndRolesFunctionByNestedSelect();
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public List<ModuleModel> getListByAllWithFunctionsAndRolesFunctionsByNestedResultMap() throws Exception {
		List<ModuleModel> list=moduleDao.selectListByAllWithFunctionsAndRolesFunctionsByNestedResultMap();
		return list;
	}
}
