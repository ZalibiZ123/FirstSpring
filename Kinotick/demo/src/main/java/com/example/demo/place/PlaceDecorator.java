package com.example.demo.place;

public class PlaceDecorator implements Place{
    protected Place place;

    public PlaceDecorator(Place p){
        this.place = p;
    }

    @Override
    public void assemble() {
        this.place.assemble();
    }
}
