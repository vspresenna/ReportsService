package com.sainsburys.analytics.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sainsburys.analytics.demo.dao.ReportViewerDao;
import com.sainsburys.analytics.demo.vo.ReportSnippet;

@Component
public class ReportViewerService {
	
	@Autowired
	private ReportViewerDao reportViewerDao;
	
	public List<ReportSnippet> fetchReportList() {
		List<ReportSnippet> reportSnippet = reportViewerDao.fetchReportList();
		return reportSnippet;
	}
}
