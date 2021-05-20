package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SomeBean implements CommandLineRunner {

    private SomeTableService someTableService;

    public SomeBean(SomeTableService someTableService){
        this.someTableService = someTableService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SAWQEWQ");
        System.out.println(someTableService.getAllTables());
    }
}
