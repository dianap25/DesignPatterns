package com.example.mycompan.facade;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Projector projector = new Projector();
        MediaPlayer mediaPlayer = new MediaPlayer();
        Lights lights = new Lights();

        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(screen, projector, mediaPlayer, lights);
        theaterFacade.startMovie();
        theaterFacade.stopMovie();
    }
}
