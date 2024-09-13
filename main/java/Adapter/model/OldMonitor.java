package Adapter.model;

import Adapter.interfaces.VGA;

public class OldMonitor implements VGA {
    @Override
    public void setImage(String image) {
        System.out.println("ligando image monitor" + image);
    }
}
