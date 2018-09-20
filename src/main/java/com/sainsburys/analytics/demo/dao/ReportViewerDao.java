package com.sainsburys.analytics.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sainsburys.analytics.demo.vo.ReportSnippet;

@Component
public class ReportViewerDao {
	public List<ReportSnippet> fetchReportList() {
		List<ReportSnippet> dashboardSnippet = new ArrayList<ReportSnippet>();
		dashboardSnippet.add(new ReportSnippet("RPT2323","Pd,time no trans","38409", "PRESENNA", "Customer profile","18-09-05 12:33"));
		dashboardSnippet.add(new ReportSnippet("RPT7363","Pd,time, trans-online-sainsburys","38380", "PRESENNA", "Customer profile","18-09-05 11:52"));
		dashboardSnippet.add(new ReportSnippet("RPT9323","Pd,time,cust,trans","38278", "PRESENNA", "Customer profile","18-09-0 16:29"));
		return dashboardSnippet;
	}
}
