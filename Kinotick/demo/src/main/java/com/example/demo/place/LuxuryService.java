package com.example.demo.place;

public class LuxuryService extends PlaceDecorator{
    public LuxuryService(Place p) {
        super(p);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding luxury services.");
    }
}
