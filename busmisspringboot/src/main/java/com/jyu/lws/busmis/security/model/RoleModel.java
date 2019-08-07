package com.jyu.lws.busmis.security.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;
@Alias("Role")
@Data
public class RoleModel implements Serializable{
	private static final long serialVersionUID = 1L;
	private int no=0;
     private String name=null;
     //角色关联的用户列表     一个角色可以有多个用户
     private List<UserModel> users=null;
     //角色关联的模块列表     一个角色负责多个模块
     private List<ModuleModel> modules=null;
}
