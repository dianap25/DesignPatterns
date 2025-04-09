package com.example.mycompan.facade;



public class HomeTheaterFacade {
    private Screen screen;
    private Projector projector;
    private MediaPlayer mediaPlayer;
    private Lights light;
    public HomeTheaterFacade(Screen screen, Projector projector,
                             MediaPlayer mediaPlayer, Lights light) {
        this.screen = screen;
        this.projector = projector;
        this.mediaPlayer = mediaPlayer;
        this.light = light;
    }

    public void startMovie(){
        System.out.println("Start movie");
        screen.down();
        light.dim();
        projector.on();
        mediaPlayer.play();
    }

    public void stopMovie(){
        System.out.println("Stop movie");
        mediaPlayer.stop();
        projector.off();
        light.on();
        screen.up();
    }
}
