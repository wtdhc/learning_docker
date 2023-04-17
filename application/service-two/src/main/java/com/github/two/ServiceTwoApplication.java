package com.github.two;

import com.github.two.model.NameValueTO;
import com.github.two.service.NameValueService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceTwoApplication {

  	@Bean
  	CommandLineRunner generateNameValue(NameValueService nameValueService) {
    	return args -> {
			nameValueService.generateUUID();
    	};
  	}

 	public static void main(String[] args) {
    	SpringApplication.run(ServiceTwoApplication.class, args);
  	}
}
