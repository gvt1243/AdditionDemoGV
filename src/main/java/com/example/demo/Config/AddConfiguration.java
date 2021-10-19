package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;


public class AddConfiguration {
	    @Bean
	    public ServletContextTemplateResolver templateResolver() {
	        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver(null);
	        resolver.setPrefix("templates/");
	        resolver.setSuffix(".html");
	        resolver.setTemplateMode("HTML5");
	        resolver.setOrder(1);
	        return resolver;
	    }
}
