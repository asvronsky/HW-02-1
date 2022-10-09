package org.example;

public class AllInOnePC extends ComputerImpl {
    Screen screen;

    public AllInOnePC(String manufacturer, String model, String cpu, String ram, String hdd, Screen screen) {
        super(manufacturer, model, cpu, ram, hdd);

        this.screen = screen;
    }

    @Override
    public String toString() {
        return super.toString()+
                "--Screen: "+screen+"\n";
    }
}
