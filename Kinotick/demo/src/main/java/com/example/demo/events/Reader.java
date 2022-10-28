package com.example.demo.events;

import java.util.List;

public class Reader implements Observer{
    public Reader(String name) {
        this.name = name;
    }

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void news(List<String> news) {
        System.out.println(name+", now the are "+ news.size() +" news!");
    }
}
