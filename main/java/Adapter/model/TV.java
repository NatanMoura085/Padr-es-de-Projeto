package Adapter.model;

import Adapter.interfaces.HDMI;

public class TV implements HDMI {
    @Override
    public void setImage(String image) {
        System.out.println("ligando imagem tv" + image);
    }

    @Override
    public void setSound(String sound) {
    System.out.println("ligando som da tv" + sound);
    }
}
