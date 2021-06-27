package com.hyeonah.springcloudopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudOpenfeignApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SpringCloudOpenfeignApplication.class, args);
    }

}
