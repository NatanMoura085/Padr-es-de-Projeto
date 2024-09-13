package Adapter.model;

import Adapter.interfaces.HDMI;

public class Compute {
    private HDMI port;

    public void connectPort(HDMI hdmi) {
        System.out.println("conectou a porta");
        this.port = hdmi;
    }

    public void setImageAndSound(String image, String sound) {
        if (port == null) {
            System.out.println("esta sem som e image");
        } else {
            port.setImage(image);
            port.setSound(sound);
        }
    }
}
