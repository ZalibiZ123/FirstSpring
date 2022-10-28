package com.example.demo.payment;

public class Ticket {
    private String filmName;
    private int price;

    public Ticket(String filmName, int cost){
        this.filmName = filmName;
        this.price = cost;
    }

    public String getFilmName() {
        return filmName;
    }

    public int getPrice() {
        return price;
    }
}
