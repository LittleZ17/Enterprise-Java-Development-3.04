package com.EnterpriseJavaDevelopment34.EnterpriseJavaDevelopment34.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


/*
3. Create all the necessary repositories and entities for the Flight table.
*/

@Entity
public class Flight {

    @Id
    private String number;

    private Long mileage;
    private String aircraft;

    public Flight() {
    }

    public Flight(String number, Long mileage, String aircraft) {
        this.number = number;
        this.mileage = mileage;
        this.aircraft = aircraft;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }
}
