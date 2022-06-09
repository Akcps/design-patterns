package io.github.akcps.creational.singleton.eager;

public class EagerSingleton {
    private static final EagerSingleton uniqueInstance = new EagerSingleton();

    // some more variables

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }

    private EagerSingleton() {
    }

    @Override
    public String toString() {
        return "EagerSingleton{}";
    }

    // some more functions
}
