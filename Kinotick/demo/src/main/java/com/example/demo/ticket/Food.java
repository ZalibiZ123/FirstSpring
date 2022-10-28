package com.example.demo.ticket;

public class Food implements Order{
    private Order order;
    private String name;
    private int price;

    public Food(Order order, String name, int price) {
        this.order = order;
        this.name = name;
        this.price = price;
    }
    @Override
    public int getPrice() {
        return this.price + order.getPrice();
    }

    public String getName() {
        return this.name + order.getName();
    }
}
