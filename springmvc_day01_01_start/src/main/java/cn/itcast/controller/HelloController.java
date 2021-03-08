package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
* RequestMapping:
*       参数:
*           value:
*           用于指定请求的URL,它和path的作用是一样的
*           注解不加任何参数时,默认是value
*           当只有一个参数时,value和path可以省略不写,如:@RequestMapping(path = "user")
*           有多个参数时,要加value,如:@RequestMapping(path = "testRequestMapping",method = {RequestMethod.POST})
*
*           method:
*           用于指定请求的方式
*           RequestMethod里是枚举类,可以直接RequestMethod.xxx
*           @RequestMapping(path = "testRequestMapping",method = {RequestMethod.POST})
*
*           params:
*           用于指定限制请求参数的条件,它支持简单的表达式,要求请求参数的key和value必须和配置的一样
*           @RequestMapping(value = "testRequestMapping",params = "username")
*           当 @RequestMapping(value = "testRequestMapping",params = "username=haha") 时
*           index.html的href里<a href="/user/testRequestMapping?username=haha">RequestMapping注解</a>
*
*           headers:
*           发送的请求中必须包含的请求头
* */
//控制器类
@Controller
@RequestMapping("/user")
public class HelloController {

	@RequestMapping(path="/hello")
	public String sayHello(){
		System.out.println("Hello springMvc");
		return "success";
	}
	/*
	* RequestMapping注解
	* */
//	@RequestMapping(path = "testRequestMapping",method = {RequestMethod.POST})
//	@RequestMapping(value = "testRequestMapping",params = "username")
	@RequestMapping(value = "testRequestMapping",params = "username=haha")
	public String testRequestMapping(){
		System.out.println("测试RequestMapping注解....");
		return "success";
	}
}
