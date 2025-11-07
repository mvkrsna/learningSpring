package com.techbuddie.learningspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfiguration {

    @Bean
    public PaymentMethod creditCardPaymentService() {
        return new CreditCardService();
    }

    @Bean
    public PaymentMethod gpayPaymentService() {
        return new GpayService();
    }

}
