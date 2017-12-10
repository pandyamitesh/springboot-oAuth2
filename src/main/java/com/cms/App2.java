package com.cms;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableResourceServer
public class App2 {
	private static final Log logger = LogFactory.getLog(App2.class);
	public static void main(String[] args) {
		SpringApplication.run(App2.class, args);
	}

	
}
