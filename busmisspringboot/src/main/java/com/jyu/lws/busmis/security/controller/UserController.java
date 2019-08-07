package com.jyu.lws.busmis.security.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jyu.lws.busmis.security.model.UserModel;
import com.jyu.lws.busmis.security.service.IUserService;

//用户的控制类
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService us=null;
	
	//显式用户列表
	@RequestMapping("/tolist")
	public String tolist(Model model) throws Exception{
		List<UserModel> userList=us.getListByAll();
		model.addAttribute("userList",  userList);
		return "user/list";
		
	}
	
	//用户的注册处理（半成品）
	@RequestMapping("/register")
	public String register(String id,String password,String name,String role,int age,Date joinDate) throws Exception{
		System.out.println(joinDate);
		return "user/list";
		
	}
	
	//验证用户登录
//	@RequestMapping("")

}
