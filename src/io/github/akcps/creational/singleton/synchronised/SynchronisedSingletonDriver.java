package io.github.akcps.creational.singleton.synchronised;

public class SynchronisedSingletonDriver {
    public static void main(String[] args) {
        SynchronisedSingleton synchronisedSingleton = SynchronisedSingleton.getInstance();
        System.out.println(synchronisedSingleton);
    }
}
