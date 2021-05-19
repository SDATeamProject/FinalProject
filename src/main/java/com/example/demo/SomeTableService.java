package com.example.demo;


import org.springframework.stereotype.Service;

@Service
public class SomeTableService {

    private SomeTableRepository someTableRepository;

    public SomeTableService(SomeTableRepository someTableRepository) {
        this.someTableRepository = someTableRepository;
    }

    public SomeTable createSomeTable(SomeTable someTable) {
        return someTableRepository.save(someTable);
    }
}
