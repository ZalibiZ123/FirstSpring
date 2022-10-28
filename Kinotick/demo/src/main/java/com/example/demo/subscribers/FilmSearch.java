package com.example.demo.subscribers;

public class FilmSearch{
    public static void main(String[] args) {
        Films films = new Films();

        films.addFilm("Avengers");
        films.addFilm("Iron Man");

        Observer firstSubscriber = new Subscriber("Beknur Sailaubek");
        Observer secondSubscriber = new Subscriber("Alibi Toleutai");

        films.addObserver(firstSubscriber);
        films.addObserver(secondSubscriber);

        films.addFilm("Black Panther");

        films.removeFilm("Iron Man");
     }
}
