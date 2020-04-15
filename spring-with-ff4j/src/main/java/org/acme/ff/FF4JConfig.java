package org.acme.ff;

import org.ff4j.FF4j;
import org.ff4j.spring.boot.web.api.config.EnableFF4jSwagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFF4jSwagger
public class FF4JConfig {

    @Bean
    public FF4j getFF4j() {
        return new FF4j("ff4j-tests.xml");
    }

}
