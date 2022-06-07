package io.github.akcps.creational.builder;

public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int batteryCapacity;

    public Phone(String os, int ram, String processor, double screenSize, int batteryCapacity) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
