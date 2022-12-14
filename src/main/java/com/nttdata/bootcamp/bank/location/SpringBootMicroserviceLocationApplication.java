package com.nttdata.bootcamp.bank.location;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMicroserviceLocationApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMicroserviceLocationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceLocationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Init Location");
    }

}