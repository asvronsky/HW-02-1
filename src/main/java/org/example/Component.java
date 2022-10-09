package org.example;

public abstract class Component {
    String manufacturer;
    String model;

    public Component(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public String toString() {
        return manufacturer+" "+model;
    }
}
