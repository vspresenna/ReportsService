package com.sainsburys.analytics.demo;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

	/**
	 * 
	 * Added this configuration to fix below error: Field velocityEngine in
	 * com.sainsburys.analytics.demo.controller.VelocityController required a bean
	 * of type 'org.apache.velocity.app.VelocityEngine' that could not be found.
	 * 
	 * @return
	 * @throws VelocityException
	 * @throws IOException
	 */

	@Bean
	public VelocityEngine getVelocityEngine() throws VelocityException, IOException {
		VelocityEngineFactory factory = new VelocityEngineFactory();
		Properties velocityProperties = new Properties();
		velocityProperties.put(RuntimeConstants.RESOURCE_LOADER, "class,file");
		velocityProperties.put("class.resource.loader.class",
				"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		velocityProperties.put("webapp.resource.loader.cache", "false");
		factory.setVelocityProperties(velocityProperties);
		return factory.createVelocityEngine();
	}
}