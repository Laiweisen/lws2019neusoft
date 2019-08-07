package com.jyu.lws.busmis.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jyu.lws.busmis.security.model.UserModel;
import com.jyu.lws.busmis.security.service.IUserService;


@RestController
@RequestMapping("/user/api")

public class UserAPIController {
	@Autowired
	private IUserService us=null;
//   使用Controller参数的各种注解类实现参数值的获取	    编程练习
// //URL地址：http://localhost:8888/busmisssm/user/api/get.do?userid=001     
//（1）@RequestParam
//	@RequestMapping("/get")
//	public UserModel getUser(@RequestParam String userid) throws Exception{
//		return us.selectById(userid);
//	}
//（2）@PathVariable
//	//URL地址：http://localhost:8888/busmisssm/user/api/get/001.do  
//	@RequestMapping("/get/{userid}")	            
//	public UserModel getUser(@PathVariable String userid) throws Exception{	
//		return us.selectById(userid);
//	}
//（3）@RequestHeader   取得指定的请求头的数据，保存在变量中    请求头值设置为001
//	//URL地址：http://localhost:8888/busmisssm/user/api/get.do
//	@RequestMapping("/get")
//	public UserModel getHeader(@RequestHeader("token") String token) throws Exception{
//		return us.selectById(token);
//	}
//（4）@CookieValue    取得指定Cookie的的值	
//	@RequestMapping("/get")
//	public String getCookieValue(@CookieValue("JSESSIONID") String ssd) throws Exception{
//		System.out.println(ssd);
//		return ssd;
//	} 
//（5）@ResponseBody   通过请求体原始JSON格式创建对象
//	//URL地址：http://localhost:8888/busmisssm/user/api/get.do
//	@RequestMapping("/get")
//	public UserModel getUser(@RequestBody UserModel um) {
//		return um;
//	}
//@SessionAttribute("userid") String uid 等价：String uid=session.getAttribute("userid");	
//@RequestAttribute("userid") String uid 等价：String uid=request.getAttribute("userid");
//@ExceptionHandler注解类， 使用在方法级别上，用于定义异常处理。
//如果所有控制器的异常处理都相同，可以考虑创建一个集中处理所有控制器出现异常的类。
//spring MVC提供了@ControllerAdvice注解类，用于声明控制器的异常处理切面。(*****com.jyu.lws.busmis.aop.RestControllerExceptionAdvice)
//***********************方法的返回类型
//ResponseEntity<B>: 等价于@ResponseBody的方法，直接发送给客户端。      增加了响应的状态码，和响应头。而@ResponseBody只能发送响应体。
//ModelAndView： 只能用于跳转的模式。     ModelAndView对象里能保存Model属性，还保存View的地址。
//HttpHeaders：  方法返回HttpHeaders,只能返回响应头。不能发送响应体。
//@ResponseBody标注的任意类型: 将返回结果直接发送到客户端，并启用结果转换器（默认JSON）。
//@ModelAttribute标注的方法返回类型： 将返回的值保存到Model属性里。           此类方法没有映射地址，只用于增加Model的属性。
//void： 方法没有返回数据，一般用于在方法内使用Response对象自己发送响应给客户端。
//String： 一般用于跳转模式， REST API尽量不要返回字符串。
	//取得列表信息   在RestController 控制器中
	@RequestMapping(value="/list",method = {RequestMethod.POST,RequestMethod.GET})	
	public List<UserModel> getListByAll() throws Exception{
		return us.getListByAll();
	}
}
