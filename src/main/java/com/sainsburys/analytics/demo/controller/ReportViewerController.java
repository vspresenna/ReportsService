package com.sainsburys.analytics.demo.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sainsburys.analytics.demo.service.ReportViewerService;
import com.sainsburys.analytics.demo.vo.ReportSnippet;
import com.sainsburys.analytics.demo.vo.ResponseObject;

@RestController
public class ReportViewerController {
	
	private static final Logger LOGGER = LogManager.getLogger(ReportViewerController.class);
	
	@Autowired
	private ReportViewerService reportService;

	@GetMapping(path = "fetchReportList/{userId}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ResponseObject<List<ReportSnippet>>> fetchReportList(@PathVariable String userId) {
		LOGGER.debug("Service fetchReportList invoked for params: userId: "+userId); // TODO log4j2.xml config not picked up log4j
		LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
		List<ReportSnippet> dashboardSnippet = reportService.fetchReportList();
		ResponseObject<List<ReportSnippet>> reports = new ResponseObject<List<ReportSnippet>>(HttpStatus.OK.value(), "Fetched the list of reports", dashboardSnippet);
		return new ResponseEntity<ResponseObject<List<ReportSnippet>>>(reports, HttpStatus.OK);
	}
}
