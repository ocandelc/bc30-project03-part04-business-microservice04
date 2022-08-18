package com.nttdata.bootcamp.bank.location;

import com.nttdata.bootcamp.bank.location.model.dao.inte.LocationDaoInte;
import com.nttdata.bootcamp.bank.location.model.document.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import java.util.Date;

@SpringBootApplication
public class SpringBootMicroserviceLocationApplication implements CommandLineRunner {

    @Autowired
    LocationDaoInte dao;
    private static final Logger log = LoggerFactory.getLogger(SpringBootMicroserviceLocationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceLocationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Init Location");
    }

}
