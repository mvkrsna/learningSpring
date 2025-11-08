package com.techbuddie.learningspring.service;

public class OnlineOrder implements Order {

    @Override
    public String placeOrder(double amount) {
        return "Order placed online: $" + amount;
    }
}
