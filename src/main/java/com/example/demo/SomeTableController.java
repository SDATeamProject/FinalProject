package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class SomeTableController {

    private SomeTableService someTableService;

    public SomeTableController(SomeTableService someTableService){
        this.someTableService = someTableService;
    }

    @GetMapping(path = "/table")
    public List<SomeTable> getAllTables(){
        return someTableService.getAllTables();
    }

    @PostMapping
    public SomeTable createSomeTable(@RequestBody SomeTable someTable){
        return someTableService.saveSomeTable(someTable);
    }
}
