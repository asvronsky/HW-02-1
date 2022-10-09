package org.example;

public class Netbook extends PortableComputer{
    public Netbook(String manufacturer, String model, String cpu, String ram, String hdd, Keyboard keyboard, Screen screen) {
        super(manufacturer, model, cpu, ram, hdd, keyboard, screen);
    }

//    @Override
//    public String toString() {
//        return "Netbook "+super.toString();
//    }
}
