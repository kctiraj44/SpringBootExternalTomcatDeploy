package com.tiraj.externalTomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootExternalTomcatApplication {

    @GetMapping("/test")
    public String getinfo(){

        return "*--Application deployed---*";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExternalTomcatApplication.class, args);
    }

}
