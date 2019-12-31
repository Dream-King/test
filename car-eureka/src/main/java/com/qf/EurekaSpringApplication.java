package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 长风 on 2019/12/11.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSpringApplication.class);
    }
}
