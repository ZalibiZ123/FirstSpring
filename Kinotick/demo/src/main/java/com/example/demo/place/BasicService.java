package com.example.demo.place;

public class BasicService implements Place{

    @Override
    public void assemble() {
        System.out.print("Basic service.");
    }
}
