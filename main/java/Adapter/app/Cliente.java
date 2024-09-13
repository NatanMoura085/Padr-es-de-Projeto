package Adapter.app;

import Adapter.adapters.HDMIToVga;
import Adapter.model.Compute;
import Adapter.model.OldMonitor;

public class Cliente {
    public static void main(String[] args) {
        Compute compute = new Compute();
        OldMonitor monitor = new OldMonitor();
        compute.connectPort(new HDMIToVga(monitor));
        compute.setImageAndSound("CAT RAINBOW","esta sem som");
    }
}
