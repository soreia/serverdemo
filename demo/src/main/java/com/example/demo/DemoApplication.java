package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.example.demo.mapper.*")
@ComponentScan("com.example.demo.*")
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext application = SpringApplication.run(DemoApplication.class, args);
		Environment env = application.getEnvironment();
        String port = env.getProperty("server.port");
		log.info("\n----------------------------------------------------------\n\t" +
		"Application DemoApplication is running! Access URLs:\n\t" +
		"Local: \t\thttp://localhost:" + port + "/\n\t" +
		"----------------------------------------------------------");
	}

}
