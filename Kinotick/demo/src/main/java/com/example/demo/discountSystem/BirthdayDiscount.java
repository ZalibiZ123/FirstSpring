package com.example.demo.discountSystem;

public class BirthdayDiscount implements DiscountStrategy{

    @Override
    public double discount(double ticketPrice) {
        return ticketPrice*0.9;
    }
}
