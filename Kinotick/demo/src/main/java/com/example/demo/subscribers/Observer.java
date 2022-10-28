package com.example.demo.subscribers;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> newFilms);
}
