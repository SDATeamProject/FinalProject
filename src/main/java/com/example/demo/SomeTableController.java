package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping
public class SomeTableController {

    private SomeTableService someTableService;

    public SomeTableController(SomeTableService someTableService){
        this.someTableService = someTableService;
    }

    @GetMapping(path = "/table")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<SomeTable> getAllTables(){
        return someTableService.getAllTables();
    }

    @PostMapping
    public SomeTable createSomeTable(@RequestBody SomeTable someTable){
        return someTableService.saveSomeTable(someTable);
    }
}
