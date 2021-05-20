package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SomeTableController {

    private SomeTableService someTableService;

    public SomeTableController(SomeTableService someTableService){
        this.someTableService = someTableService;
    }

    @GetMapping(path = "/table")
    public List<SomeTable> getAllTables(){
        return someTableService.getAllTables();
    }
}
