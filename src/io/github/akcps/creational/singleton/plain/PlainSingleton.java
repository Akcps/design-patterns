package io.github.akcps.creational.singleton.plain;

public class PlainSingleton {
    private static PlainSingleton uniqueInstance;

    // some useful variables

    private PlainSingleton() {
    }

    public static PlainSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PlainSingleton();
        }
        return uniqueInstance;
    }

    @Override
    public String toString() {
        return "PlainSingleton{}";
    }

    // some useful methods here

}
