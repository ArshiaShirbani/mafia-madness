package com.mafiamadness.mafiaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MafiaGameApplication{
    public static void main(String[] args) {
        SpringApplication.run(MafiaGameApplication.class, args);
    }
}
