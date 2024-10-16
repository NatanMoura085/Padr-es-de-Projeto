package Flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static FlyweightFactory instance = new FlyweightFactory();
    private static Map<String, FlyweightMusic> memory;

    public FlyweightFactory() {
        memory = new HashMap<>();
    }

    public static FlyweightFactory getInstance() {
        return instance;
    }

    public FlyweightMusic getMusic(String desc) {
        FlyweightMusic flyweightMusic = memory.get(desc);
        flyweightMusic = getByStringMusic(desc);
        memory.put(desc, flyweightMusic);

        return flyweightMusic;
    }

    public FlyweightMusic getByStringMusic(String desc) {
        String[] musicData = desc.split(";");
        return new FlyweightMusic(musicData[0], musicData[1], musicData[2]);
    }

    public Integer getSize() {
        return memory.size();
    }

}
