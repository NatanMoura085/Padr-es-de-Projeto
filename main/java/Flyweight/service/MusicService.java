package Flyweight.service;

import Flyweight.flyweight.FlyweightFactory;
import Flyweight.model.Music;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MusicService {
    private Map<String, Map<String, Music>> memory;

    public MusicService() {
        memory = new HashMap<>();
    }

    public Map<String, Music> listiningMusic(String user, String desc) {
        Map<String, Music> userList = memory.get(user);
        if (userList == null) {
            userList = new HashMap<>();
        }

        Music song = userList.get(desc);

        if (song == null) {
            song = new Music(FlyweightFactory.getInstance().getMusic(desc));
        }
        song.listining();
        userList.put(user, song);
        memory.put(user, userList);

        return userList;
    }


    public void rapport() {
        Set<String> users = memory.keySet();
        int count = 0;
        Collection<Map<String, Music>> collection = memory.values().stream().toList();

        for (String user : users) {
            System.out.println(users);

            for (Map<String, Music> musicMap : collection) {
                musicMap.values().stream().forEach(System.out::println);

            }
        }



    }

}
