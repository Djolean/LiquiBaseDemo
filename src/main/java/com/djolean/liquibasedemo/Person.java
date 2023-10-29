package com.djolean.liquibasedemo;

import jakarta.persistence.*;

@Entity
@Table( name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column
    private String name;
    @Column
    private String height;

}
