package com.springboot.microservice.application;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication implements CommandLineRunner {

    private static final Logger log= LoggerFactory.getLogger(SpringBootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class,args);
    }

    @Override
    public void run(String... args) {
        log.info("Hi");
        log.info("Sreeee");
        log.info("How are you");

    }
}
