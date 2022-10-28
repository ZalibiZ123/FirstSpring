package com.example.demo.events;

public interface EventManager {
    public void addReader(Observer reader);
    public void removeReader(Observer reader);
    public void notifyReaders();
}
