package com.example.demo.entity;

public class Appliance {
    private long id;
    private String applianceName;
    private Double wattage;
    private Double usageHoursPerDay;
    private User user;

    public Appliance(){}
    public Appliance(String applianceName,Double wattage,Double usageHoursPerDay,User user){
        this.applianceName=applianceName;
        this.wattage=wattage;
        this.usageHoursPerDay=usageHoursPerDay;
        this.user=user;
    }
    public long getId() {
        return id;
    }
    public String getApplianceName() {
        return applianceName;
    }
    public Double getWattage() {
        return wattage;
    }
    public Double getUsageHoursPerDay() {
        return usageHoursPerDay;
    }
    public User getUser() {
        return user;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }
    public void setWattage(Double wattage) {
        this.wattage = wattage;
    }
    public void setUsageHoursPerDay(Double usageHoursPerDay) {
        this.usageHoursPerDay = usageHoursPerDay;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
}
