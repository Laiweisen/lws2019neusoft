package com.jyu.lws.busmis.security.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("Module")
@Data
public class ModuleModel implements Serializable{
	private static final long serialVersionUID = 1L;
	private int no=0;
	private String name=null;
	//关联到功能列表  一个模块可以有多个功能
	private List<FunctionModel> functions=null;
	//关联到角色列表   一个模块可以有多个角色
	private List<RoleModel> roles=null;
}
