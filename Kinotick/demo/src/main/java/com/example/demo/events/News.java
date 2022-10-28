package com.example.demo.events;

import java.util.ArrayList;

public class News implements EventManager{
    String text;


    private ArrayList<Observer> readers = new ArrayList<Observer>();
    private ArrayList<String> news = new ArrayList<String>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addNews(String text) {
        news.add(text);
        notifyReaders();
    }

    @Override
    public void addReader(Observer reader) {
        readers.add(reader);
    }

    @Override
    public void removeReader(Observer reader) {
        readers.remove(reader);
    }

    @Override
    public void notifyReaders() {
        for (Observer readers : readers) {
            System.out.println("Hello Readers! Here is the updates: \n");
            System.out.println("Now the are "+ news.size() +" news!");
        }
    }
}
