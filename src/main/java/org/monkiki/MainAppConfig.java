package org.monkiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by pavila on 17/06/16.SpringBootApplication
 * <p>
 * https://spring.io/guides/gs/spring-boot/
 * <p>
 * By default all packages below your main configuration class (the one annotated with @EnableAutoConfiguration or @SpringBootApplication) will be searched.
 */

@SpringBootApplication
public class MainAppConfig extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(MainAppConfig.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MainAppConfig.class);
	}
}
