package Flyweight.model;

import Flyweight.flyweight.FlyweightMusic;

public class Music {
    private FlyweightMusic flyweightMusic;
    private Integer platQty;

    public Music(FlyweightMusic flyweightMusic) {
        this.flyweightMusic = flyweightMusic;
        this.platQty = 0;
    }

    public void listining() {
        platQty++;
    }

    public FlyweightMusic getFlyweightMusic() {
        return flyweightMusic;
    }

    public Integer getPlatQty() {
        return platQty;
    }

    @Override
    public String toString() {
        return "Music{" +
                "flyweightMusic=" + flyweightMusic +
                ", platQty=" + platQty +
                '}';
    }
}
