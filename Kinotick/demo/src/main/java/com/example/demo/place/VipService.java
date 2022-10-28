package com.example.demo.place;

public class VipService extends PlaceDecorator{
    public VipService(Place p) {
        super(p);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding vip services.");
    }
}
