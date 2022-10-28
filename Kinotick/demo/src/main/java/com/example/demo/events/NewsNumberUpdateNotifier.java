package com.example.demo.events;

public class NewsNumberUpdateNotifier {
    public static void main(String[] args) {
        News news1 = new News();

        Reader reader1 = new Reader("Steve");

        news1.addNews("News number one!");
        news1.addReader(reader1);
        news1.addNews("News number two!");


    }
}
