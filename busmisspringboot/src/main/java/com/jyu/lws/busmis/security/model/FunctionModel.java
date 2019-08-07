package com.jyu.lws.busmis.security.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("Function")
@Data
public class FunctionModel implements Serializable{
	private static final long serialVersionUID = 1L;
	private int no=0;
	private String name=null;
	private String url=null;
	//外键字段对应的类型
	private ModuleModel module=null;
}
