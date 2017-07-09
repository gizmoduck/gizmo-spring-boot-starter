package com.gizmodk.gizmopedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GizmopediaApplication {

	@Bean
	public StartupRunner scheduleRunner() {
		return new StartupRunner();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GizmopediaApplication.class, args);
		
	}
}
