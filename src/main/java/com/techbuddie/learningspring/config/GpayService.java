package com.techbuddie.learningspring.config;


public class GpayService implements PaymentMethod {

    @Override
    public String processPayment(double amount) {
        return "Processing payment of $" + amount + " through GPay.";
        // Add GPay specific payment processing logic here
    }

}
