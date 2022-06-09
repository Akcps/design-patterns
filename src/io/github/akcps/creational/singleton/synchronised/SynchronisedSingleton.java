package io.github.akcps.creational.singleton.synchronised;

public class SynchronisedSingleton {
    private static SynchronisedSingleton uniqueInstance;

    // some useful variables

    private SynchronisedSingleton() {
    }

    public static synchronized SynchronisedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronisedSingleton();
        }
        return uniqueInstance;
    }

    @Override
    public String toString() {
        return "SynchronisedSingleton{}";
    }

    // some useful methods here
}
