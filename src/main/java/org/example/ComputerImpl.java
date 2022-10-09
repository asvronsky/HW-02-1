package org.example;

public abstract class ComputerImpl implements Computer
{
    String manufacturer;
    String model;

    String cpu;
    String ram;
    String hdd;

    public ComputerImpl(String manufacturer, String model, String cpu, String ram, String hdd) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return manufacturer+" "+model+":\n"+
                "--CPU: "+cpu+"\n"+
                "--RAM: "+ram+"\n"+
                "--HDD: "+hdd+"\n";
    }

    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+this;
    }

    public String turnOff() {
        return "Turn on "+getClass().getSimpleName()+" "+ this;
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+ this;
    }
}
