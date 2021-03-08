package cn.itcast.Conroller.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 自定义拦截器
* */
public class MyInterceptor1 implements HandlerInterceptor {
	/*
	* 预处理,controller方法执行前
	* return true 放行,执行下一个拦截器,如果没有,执行controller中的方法
	* return false不放行
	* */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("MyInterceptor1执行了...前111");
//		request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
		return true;
	}
	/*
	* 后处理方法:controller方法执行后,success.jsp执行之前
	* */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("MyInterceptor1执行了...后111");
	}
	/*
	* success.jsp页面执行后,该方法会执行
	* */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		System.out.println("MyInterceptor1执行了...最后111");
	}
}
