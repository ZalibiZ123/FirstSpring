package com.example.demo.discountSystem;

public class NauryzDiscount implements DiscountStrategy{

    @Override
    public double discount(double ticketPrice) {
        return ticketPrice*0.2;
    }
}
