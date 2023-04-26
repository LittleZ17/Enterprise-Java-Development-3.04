package com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.model;

import jakarta.persistence.*;

/*
1. Create all the necessary repositories and entities for the Customer table.
*/

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(columnDefinition = "ENUM('NONE', 'SILVER', 'GOLD')")
    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    public Customer() {
    }

    public Customer( String name, CustomerStatus status) {
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
