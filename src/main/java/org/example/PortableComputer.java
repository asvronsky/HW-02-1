package org.example;

public abstract class PortableComputer extends ComputerImpl {
    Keyboard keyboard;
    Screen screen;

    public PortableComputer(String manufacturer, String model, String cpu, String ram, String hdd, Keyboard keyboard, Screen screen) {
        super(manufacturer, model, cpu, ram, hdd);

        this.keyboard = keyboard;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return super.toString()+
                "--Keyboard: "+keyboard+"\n"+
                "--Screen: "+screen+"\n";
    }
}
