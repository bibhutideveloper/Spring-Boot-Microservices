package com.bibhuti;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@Component
//public class UserDao {
public class UserDao implements InitializingBean, DisposableBean{
	/*
	 * declarative approach (xml base approach): bean life cycle
	 */
	
//	public void init() {
//		System.out.println("getting db connection");
//	}
//	
//	public void getData() {
//		System.out.println("getting data from db");
//	}
//		
//	public void destroy() {
//		System.out.println("closing dbconnection");
//	}
	
	
	/*
	 * programmatic approach: bean life cycle
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method");
	}
	
	public void getData() {
		System.out.println("getting data from db");
	}
	
	/*
	 * annotation approach: bean life cycle
	 */
	
//	@PostContruct
//	public void init() {
//		System.out.println("getting db connection");
//	}
//	
//	public void getData() {
//		System.out.println("getting data from db");
//	}
//	
//	@PreDestroy
//	public void destroy() {
//		System.out.println("closing dbconnection");
//	}
}
