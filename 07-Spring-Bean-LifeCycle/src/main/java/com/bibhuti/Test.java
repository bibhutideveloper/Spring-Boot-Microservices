package com.bibhuti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// starting IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		UserDao dao = context.getBean(UserDao.class);
		
		dao.getData();
		
		// closing IOC container
		ConfigurableApplicationContext cctx = (ConfigurableApplicationContext) context;
		
		cctx.close();
		
	}
}
