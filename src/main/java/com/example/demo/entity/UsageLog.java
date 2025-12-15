package com.example.demo.entity;

import java.time.LocalDate;

public class UsageLog {
    private long id;
    private Appliance appliance;
    private LocalDate date;
    private Double unitsConsumed;

    public UsageLog(){}
    public UsageLog(Appliance appliance,LocalDate date,Double unitsConsumed){
        this.appliance=appliance;
        this.date=date;
        this.unitsConsumed=unitsConsumed;
    }
    public long getId() {
        return id;
    }
    public Appliance getAppliance() {
        return appliance;
    }
    public LocalDate getDate() {
        return date;
    }
    public Double getUnitsConsumed() {
        return unitsConsumed;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setAppliance(Appliance appliance) {
        this.appliance = appliance;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setUnitsConsumed(Double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }
    
}
