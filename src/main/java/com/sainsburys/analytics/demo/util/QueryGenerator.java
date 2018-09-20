package com.sainsburys.analytics.demo.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryGenerator {
	
	@Autowired
    private VelocityEngine velocityEngine;
	
	public String generateQuery() {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("title", "title c");
            model.put("body", "body c");
            String query = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,"templates/queries.vm", "UTF-8", model);
            System.out.println(query);
            return null;
	      }
	}
}
