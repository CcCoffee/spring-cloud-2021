package com.study.cloud.discovery;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ServiceDiscoveryApplication.class, args);
        new SpringApplicationBuilder(ServiceDiscoveryApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }
}
