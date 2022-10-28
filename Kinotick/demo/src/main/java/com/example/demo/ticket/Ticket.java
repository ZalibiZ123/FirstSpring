package com.example.demo.ticket;

public class Ticket implements Order{
    private int price;
    private String type;
    public Ticket(String type) {
        this.type = type;
        switch(type) {
            case "Adult": price = 1500; break;
            case "Child": price = 750; break;
            case "Student": price = 0;break;
        }
    }

    @Override
    public int getPrice() {
        return this.price;
    }
    public String getName(){
        return this.type;
    }
}


