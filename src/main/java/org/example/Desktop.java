package org.example;

public class Desktop extends ComputerImpl {
    String gpu;

    public Desktop(String manufacturer, String model, String cpu, String ram, String hdd, String gpu) {
        super(manufacturer, model, cpu, ram, hdd);
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return super.toString()+
                "--GPU: "+gpu+"\n";
    }
}
