package com.example.demo;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="sometable")
public class SomeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sometableid")
    private int sometableid;

    @Column(name = "title")
    private String title;

    public SomeTable(String title){
        this.title = title;
    }
}
