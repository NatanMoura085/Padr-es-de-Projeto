package Flyweight.app;

import Flyweight.service.MusicService;

public class Cliente {
    public static void main(String[] args) {
        MusicService musicService = new MusicService();
        MusicService musicService1 = new MusicService();
        musicService1.listiningMusic("userA","The Unfforgiven;Mettalica;300");
        musicService.listiningMusic("userA","The Unfforgiven;Mettalica;300");
        musicService.rapport();
        musicService1.rapport();
    }
}
