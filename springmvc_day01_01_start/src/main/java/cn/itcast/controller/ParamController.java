package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
* 请求参数绑定
* */
@Controller
@RequestMapping("param")
public class ParamController {
	/*
	* 请求参数绑定入门
	* */
	@RequestMapping("/testParam")
	public String testParam(String username){
		System.out.println("执行了...");
		System.out.println("用户名:"+username);
		return "success";

	}
	/*
	* 请求参数绑定,把数据封装到JavaBean类中
	* */
//	@RequestMapping("/saveAccount")
//	public String saveAccount(Account account){
//		System.out.println(account);
//		return "success";
//
//	}
	/*
	 * 自定义类型转换器
	 * */
	@RequestMapping("/saveUser")
	public String saveUser(User user){
		System.out.println("执行了");
		System.out.println(user);
		return "success";

	}
	/*
	* 原生的API
	* */
	@RequestMapping("/testServlet")
	public String testServlet(HttpServletRequest request, HttpServletResponse response){
		System.out.println("执行了");
		System.out.println(request);
		HttpSession session = request.getSession();
		System.out.println(session);

		ServletContext servletContext = session.getServletContext();
		System.out.println(servletContext);

		System.out.println(response);
		return "success";

	}
}