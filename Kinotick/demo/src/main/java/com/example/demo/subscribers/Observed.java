package com.example.demo.subscribers;

public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public  void notifyObservers();
}
