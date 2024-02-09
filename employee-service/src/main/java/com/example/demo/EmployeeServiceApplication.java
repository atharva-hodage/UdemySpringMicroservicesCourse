package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
/*
@EnableFeignClients is a Spring annotation that enables the Feign client in a Spring Boot application.
 Feign is a declarative web service client that makes writing web service clients easier.
  To use Feign, you create an interface and annotate it with @FeignClient.
   @EnableFeignClients scans the classpath for @FeignClient interfaces and generates a proxy for each interface.
    The generated proxy implements the interface and makes HTTP requests to the specified URL. 
    @EnableFeignClients is typically used in the main class of a Spring Boot application
*/
@EnableFeignClients 
public class EmployeeServiceApplication {
	
//	@Bean
//	public RestTemplate restTemplate() {
//		 return new RestTemplate();
//	}
	@Bean
	public WebClient webClient() {
		 // WebClient.builder() creates a builder for WebClient.
        // You can customize the WebClient using various builder methods.
        // For example, you can set timeouts, default headers, or configure a base URI.
		return WebClient.builder().build();
	}
	/*This method is a part of a Java class, 
	 * and it defines a method named webClient that returns an instance of WebClient. 
	 * The WebClient is built using the builder() method, which allows for further configuration, 
	 * and then the build() method is called to create the WebClient instance.
*/
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
