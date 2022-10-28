package com.example.demo.place;

public class DecoratorRunner {

    public static void main(String[] args) {
        Place VipPlace = new VipService(new BasicService());
        VipPlace.assemble();
        System.out.println("\n*****");

        Place VipLuxuryCar = new VipService(new LuxuryService(new BasicService()));
        VipLuxuryCar.assemble();
    }

}