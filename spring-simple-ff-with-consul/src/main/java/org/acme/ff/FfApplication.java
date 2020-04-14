package org.acme.ff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableConfigurationProperties
public class FfApplication {

	public static void main(String[] args) {
		SpringApplication.run(FfApplication.class, args);
	}

//	public static void main(String[] args) {
//		new SpringApplicationBuilder(FfApplication.class)
//				.web(WebApplicationType.SERVLET).run(args);
//	}
}
