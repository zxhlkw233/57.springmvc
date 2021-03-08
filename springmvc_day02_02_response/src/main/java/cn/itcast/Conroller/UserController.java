package cn.itcast.Conroller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/testString")
	public String testString(Model model){
		System.out.println("testString");
		//模拟从数据库中查询出User对象
		User user  = new User();
		user.setUsername("zhangsan");
		user.setPassword("123");
		user.setAge(30);
		//mode对象
		model.addAttribute("user",user);
		return "success";
	}

	@RequestMapping("/testVoid")
	public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("testVoid");
//		//编写请求转发的程序
//		request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

		//重定向
//		response.sendRedirect(request.getContextPath()+"/index.jsp");

		//设置中文乱码
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		//直接会进行响应
		response.getWriter().print("你好");
		return ;
	}
	/*
	* 返回ModelAndView
	* */
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView(){
		//创建ModelAndView对象
		ModelAndView mv = new ModelAndView();
		System.out.println("testModelAndView方法执行了...");
		//模拟从数据库中查询出User对象
		User user  = new User();
		user.setUsername("zhangsan");
		user.setPassword("123");
		user.setAge(30);
		//把user对象存储到mv对象中,也会把user对象存入到request当中
		mv.addObject("user",user);

		//跳转到哪个页面
		mv.setViewName("success");

		return mv;
	}
	/*
	*使用关键字的方式进行转发或者重定向
	* */
	@RequestMapping("/testForwardOrRedirect")
	public String testForwardOrRedirect(){
		System.out.println("testForwardOrRedirect");
		//请求转发
//		return "forward:/WEB-INF/pages/success.jsp";

		//重定向
		return "redirect:/index.jsp1";
	}
	/*
	* 模拟异步请求响应
	* */
	@RequestMapping("/testAjax")
	public @ResponseBody
	User testAjax(@RequestBody User user){
		System.out.println("testAjax");
		//客户端发送ajax的请求,传的是json字符串,后端把json字符串封装到user对象中
		System.out.println(user);
		//做响应,模拟查询数据库

		user.setUsername("haha");
		user.setAge(40);
		//做响应
		return user;

	}
}
