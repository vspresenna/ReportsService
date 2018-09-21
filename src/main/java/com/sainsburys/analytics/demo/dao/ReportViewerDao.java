package com.sainsburys.analytics.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException
import java.util.Properties;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.sainsburys.analytics.demo.util.QueryGenerator;
import com.sainsburys.analytics.demo.vo.ReportSnippet;

@Component
public class ReportViewerDao {
	
	@Autowired
	private QueryGenerator queryGen;
	
	public List<ReportSnippet> fetchReportList() {
		List<ReportSnippet> dashboardSnippet = new ArrayList<ReportSnippet>();
		dashboardSnippet.add(new ReportSnippet("RPT2323","Pd,time no trans","38409", "PRESENNA", "Customer profile","18-09-05 12:33"));
		dashboardSnippet.add(new ReportSnippet("RPT7363","Pd,time, trans-online-sainsburys","38380", "PRESENNA", "Customer profile","18-09-05 11:52"));
		dashboardSnippet.add(new ReportSnippet("RPT9323","Pd,time,cust,trans","38278", "PRESENNA", "Customer profile","18-09-0 16:29"));
		try {
			getConnection();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return dashboardSnippet;
	}
	
	private static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.snowflake.client.jdbc.SnowFlakeDriver");
		} catch (ClassNotFoundException e) {
				
		}
		Properties prop = new Properties();
		prop.put("user","etl");
		prop.put("");
		prop.put("account","");
		prop.put("db","SAINS_DB");
		prop.put("schema","INC");
		
		String connectionStr = "jdbc:snowflake://lo51516.eu-west-1.snowflakecomputing.com/";
		return DriverManager.getConnection(connectionStr, prop);
	}
}
