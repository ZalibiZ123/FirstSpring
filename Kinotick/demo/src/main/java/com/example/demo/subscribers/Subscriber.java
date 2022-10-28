package com.example.demo.subscribers;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> newFilms) {
        System.out.println("Dear, " + name + "\nWe have new films!\n" + newFilms + "\n===============\n");
    }
}
