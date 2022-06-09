package io.github.akcps.creational.singleton.doublepacking;

public class DoubleLockSingleton {
    private volatile static DoubleLockSingleton uniqueInstance;

    // some variables

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleLockSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleLockSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    public String toString() {
        return "DoubleLockSingleton{}";
    }

    // some more functions
}
