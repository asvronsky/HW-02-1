package org.example;

public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Logitech", "MK345", "Dvorak");
        Screen screen = new Screen("ViewSonic", "VX3276-MHD", 32.1f);
        String cpu = "AMD Ryzen 5 5600X";
        String ram = "Corsair Vengeance RGB Pro 32GB";
        String hdd = "Seagate BarraCuda 2TB";
        String gpu = "Nvidia RTX 3060";

        Netbook netbook = new Netbook("Dell", "Latitude 3000", cpu, ram, hdd, keyboard, screen);
        Laptop laptop = new Laptop("Acer", "Aspire 7", cpu, ram, hdd, keyboard, screen);
        Desktop desktop = new Desktop("Skytech", "Shadow", cpu, ram, hdd, gpu);
        AllInOnePC aio = new AllInOnePC("IMac", "2 extra", cpu, ram, hdd, screen);
        Server server = new Server("HP", "Proliant DL380P", cpu, ram, hdd);
        Nettop nettop = new Nettop("Intel", "Centrino Atom", cpu, ram, hdd);

        Computer[] computers = {netbook, laptop, desktop, aio, server, nettop};
        for(Computer c: computers) {
            System.out.println(c.turnOn());
            System.out.println(c.connect());
            System.out.println(c.turnOff());
        }

    }
}