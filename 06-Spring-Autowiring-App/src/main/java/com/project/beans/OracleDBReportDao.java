package com.project.beans;

import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleDBReportDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("Getting data from oracle db");
	}

}
