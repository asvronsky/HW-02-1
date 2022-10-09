package org.example;

public class Laptop extends PortableComputer {
    public Laptop(String manufacturer, String model, String cpu, String ram, String hdd, Keyboard keyboard, Screen screen) {
        super(manufacturer, model, cpu, ram, hdd, keyboard, screen);
    }

//    @Override
//    public String toString() {
//        return "Laptop "+super.toString();
//    }
}
