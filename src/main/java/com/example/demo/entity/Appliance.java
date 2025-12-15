package com.example.demo.entity;

public class Appliance {
    private long id;
    private String applianceName;
    private Double wattage;
    private Double usageHoursPerDay;
    private User user;

    public Appliance(){}
    public Appliance(long id,String applianceName,Double wattage,Double usageHoursPerDay,User user){
        this.id=id;
        this.applianceName=applianceName;
        this.wattage=wattage;
        this.usageHoursPerDay=usageHoursPerDay;
        this.user=user;
    }
    
}
