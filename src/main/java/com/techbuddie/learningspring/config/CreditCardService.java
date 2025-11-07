package com.techbuddie.learningspring.config;


public class CreditCardService implements PaymentMethod {
    @Override
    public String processPayment(double amount) {
        return "Processing credit card payment of $" + amount;
    }
}
