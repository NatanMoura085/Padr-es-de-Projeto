package Adapter.adapters;

import Adapter.interfaces.HDMI;
import Adapter.interfaces.VGA;

public class HDMIToVga implements HDMI {
    private VGA vga;

    public HDMIToVga(VGA vga){
        this.vga = vga;
    }
    @Override
    public void setImage(String image) {
        vga.setImage(image);

    }

    @Override
    public void setSound(String sound) {
     System.out.println("desculpas nao tem som");
    }



}
