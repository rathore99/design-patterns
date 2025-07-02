package org.example;


import java.util.ArrayList;
import java.util.List;

interface Switchable {
    void turnOn();
}

class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("Light on");
    }
}

class LedBuld implements Switchable {
    public void turnOn() {
        System.out.println("Led Buld on");
    }
}

class Switch {
    private final List<Switchable> devices = new ArrayList<>();

    public void add(Switchable device) {
        devices.add(device);
    }

    public void operate() {
        for (Switchable device : devices) {
            device.turnOn();
        }
    }
}

public class DIP {

    public static void main(String[] args) {
        Switch obj = new Switch();
        obj.add(new LedBuld());
        obj.add(new LightBulb());
        obj.operate();
    }
}
