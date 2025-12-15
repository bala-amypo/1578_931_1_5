package com.example.demo.entity;

import java.time.LocalDateTime;

public class Recommendation {
    private long id;
    private User user;
    private String message;
    private LocalDateTime generatedOn;

    public Recommendation(){
    }
    public Recommendation(User user,String message,LocalDateTime generatedOn){
        this.user=user;
        this.message=message;
        this.generatedOn=generatedOn;
    }
    public long getId() {
        return id;
    }
    public User getUser() {
        return user;
    }
    public String getMessage() {
        return message;
    }
    public LocalDateTime getGeneratedOn() {
        return generatedOn;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setGeneratedOn(LocalDateTime generatedOn) {
        this.generatedOn = generatedOn;
    }
    
}
