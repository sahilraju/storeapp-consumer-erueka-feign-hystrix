package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableCircuitBreaker 
@EnableHystrixDashboard 
@SpringBootApplication
public class StoreappConsumerEruekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappConsumerEruekaFeignApplication.class, args);
	}

}
