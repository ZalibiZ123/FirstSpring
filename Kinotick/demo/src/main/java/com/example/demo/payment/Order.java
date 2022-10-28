package com.example.demo.payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Ticket> tickets;

    public Order(){
        this.tickets =new ArrayList<Ticket>();
    }

    public void addItem(Ticket ticket){
        this.tickets.add(ticket);
    }

    public void removeItem(Ticket ticket){
        this.tickets.remove(ticket);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Ticket ticket : tickets){
            sum += ticket.getPrice();
        }
        return sum;
    }

    public void pay(Payment paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
