package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomeTableService {

    private SomeTableRepository someTableRepository;

    public SomeTableService(SomeTableRepository someTableRepository) {
        this.someTableRepository = someTableRepository;
    }

    public SomeTable createSomeTable(SomeTable someTable) {
        return someTableRepository.save(someTable);
    }

    public List<SomeTable> getAllTables(){
        return someTableRepository.findAll();
    }

    public List<SomeTable> findAll(){
       return someTableRepository.findAll();
    }

    public SomeTable saveSomeTable(SomeTable someTable){
        return someTableRepository.save(someTable);
    }
}
