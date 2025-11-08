package com.techbuddie.learningspring.service;

public class OfflineOrder implements Order {

    @Override
    public String placeOrder(double amount) {
        return "Order placed offline: $" + amount;
    }
}
