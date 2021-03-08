package cn.itcast.test;

import cn.itcast.dao.IAccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

	/*
	* 查询所有
	* */
	@Test
	public void run1() throws Exception {
		//加载mybatis配置文件
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//创建SqlSessionFactory对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession对象
		SqlSession session = factory.openSession();
		//获取到代理对象
		IAccountDao dao = session.getMapper(IAccountDao.class);
		//查询所有的账户信息
		List<Account> accounts = dao.findAll();
		for (Account account : accounts) {
			System.out.println(account);
		}
		//关闭资源
		session.close();
		in.close();
	}
	//保存
	@Test
	public void run2() throws Exception {
		Account account = new Account();
		account.setName("王五");
		account.setMoney(123d);
		//加载mybatis配置文件
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//创建SqlSessionFactory对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession对象
		SqlSession session = factory.openSession();
		//获取到代理对象
		IAccountDao dao = session.getMapper(IAccountDao.class);
		//保存
		dao.saveAccount(account);
		//提交事务

		session.commit();
		//关闭资源
		session.close();
		in.close();
	}
}
