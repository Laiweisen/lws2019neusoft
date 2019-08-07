package com.jyu.lws.busmis.security.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;


//用户的Model类
@Alias("User")
@Data          
public class UserModel implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id=null;
      private String password=null;
      private String name=null;
      private String role=null;
      private int age=0;
	  private Date joinDate=null;
      private String Status=null; //激活状态  Y激活  N终止
  	  //关联角色列表
  	  private List<RoleModel> roles=null;
}
