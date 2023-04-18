package com.disney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DisneyBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisneyBackApplication.class, args);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode("12345");
        System.out.println("password sin encriptar: 12345");
        System.out.println("password encriptada: " + password);
    }

}
