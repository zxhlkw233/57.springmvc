package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/*
* 常用的注解
* */
@Controller
@RequestMapping("/anno")
public class AnnoController {
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam(name = "name") String uname){
		System.out.println(uname);
		return "success";
	}
	/*
	* 获取请求体的内容
	* */
	@RequestMapping("/testRequestBody")
	public String testRequestBody(@RequestBody String body){
		System.out.println(body);
		return "success";
	}
	/*
	 * 获取请求体的内容
	 * */
	@RequestMapping(value="/testPathVariable/{id}")
	public String testPathVariable(@PathVariable String id){
		System.out.println("执行了");
		System.out.println(id);
		return "success";
	}
	/*
	 * 获取请求头的值
	 * */
	@RequestMapping(value="/testRequestHeader/{id}")
	public String testRequestHeader(@RequestHeader(value = "Accept") String header){
		System.out.println("执行了");
		System.out.println(header);
		return "success";
	}
	/*
	 * 获取请求头的值
	 * */
	@RequestMapping(value="/testModeAttribute")
	public String testModeAttribute(User user){
		System.out.println("testModeAttribute执行了");
		System.out.println(user);
		return "success";
	}
	@ModelAttribute
	public void showUser(String uname){
		System.out.println("showUser执行了");
		
	}
	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(Model model){
		System.out.println("testSessionAttributes...");
		model.addAttribute("msg","meimei");
		return "success";
	}
}
