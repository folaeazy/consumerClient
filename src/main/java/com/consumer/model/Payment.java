package com.consumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Payment {
    @JsonProperty
    private String id;
    @JsonProperty
    private  double amount;

//    public double getAmount() {
//        return amount;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setAmount(double amount) {
//        this.amount = amount;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
}
