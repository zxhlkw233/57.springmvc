package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.IAccountService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*
* 账户web层
* */
@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private IAccountService iAccountService;

	@RequestMapping("/findAll")
	public String findAll(Model model){
		System.out.println("表现层:查询所有的账户的信息");
		List<Account> accounts = iAccountService.findAll();
		model.addAttribute("accounts",accounts);
		return "list";
	}
	@RequestMapping("/save")
	public String save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("表现层:查询所有的账户的信息");
		iAccountService.saveAccount(account);
//		response.sendRedirect(request.getContextPath()+"/account/findAll");
		return "redirect:/account/findAll";
	}
}
