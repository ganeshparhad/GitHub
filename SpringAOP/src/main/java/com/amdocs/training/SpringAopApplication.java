package com.amdocs.training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amdocs.training.SpringAOP.service.HelloWorldService;
@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
@Autowired
private HelloWorldService service;
public static void main(String[] args) {
SpringApplication.run(SpringAopApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
System.out.println(service.getHelloMessage());
}
}