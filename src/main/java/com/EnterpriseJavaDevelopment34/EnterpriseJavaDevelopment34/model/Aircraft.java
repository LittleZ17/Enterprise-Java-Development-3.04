package com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/*
2. Create all the necessary repositories and entities for the Aircraft table.
*/

@Entity
public class Aircraft {
    @Id
    private String model;
    private Integer seats;

    public Aircraft() {
    }

    public Aircraft(String model, Integer seats) {
        this.model = model;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
