package com.yeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.yeo")
@EnableSwagger2
public class SampleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDemoApplication.class, args);
	}
}
