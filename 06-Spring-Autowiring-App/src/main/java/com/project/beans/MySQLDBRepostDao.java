package com.project.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
@Primary
public class MySQLDBRepostDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("getting data from mysql db");
	}

}
