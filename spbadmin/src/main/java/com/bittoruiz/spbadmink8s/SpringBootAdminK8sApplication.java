package com.bittoruiz.spbadmink8s;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@EnableScheduling
public class SpringBootAdminK8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminK8sApplication.class, args);
    }

}
