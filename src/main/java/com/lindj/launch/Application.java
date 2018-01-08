package com.lindj.launch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by lindongjie on 17/11/30.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
