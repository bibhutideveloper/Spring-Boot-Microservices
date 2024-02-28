package com.project.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	/* 
	 * field injection 
	 */
	
//	@Autowired
//	@Qualifier("oracleDao")
	private ReportDao dao;
	
	
	/* 
	 * setter dependency injection 
	 */
	
//	@Autowired
//	public void setDao(ReportDao dao) {
//		System.out.println("Setter method called");
//		this.dao = dao;
//	}
	
	/*
	 * constructor dependency injection
	 * ================================
	 * - when there is only one constructor, @Autowired is optional
	 * - when multiple constructor is available, need to mention @Autowired 
	 *   with which constructor we want to make object by IOC
	 * - Otherwise IOC get ambiguity issue
	 * - By default, IOC use default constructor
	 * - If we don't use @Autowired, IOC will use default constructor to make object
	 */
	
	public ReportService() {
		System.out.println("Report service :: 0 param-Constructor");
	}
	
	@Autowired
	public ReportService(ReportDao dao) {
		System.out.println("Report service :: param-Constructor");
		this.dao = dao;
	}
	
	public void generateRepost() {
		dao.getData();
		System.out.println("Report generated");
	}
	
}
