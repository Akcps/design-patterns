package io.github.akcps.creational.singleton.eager;

public class EagerSingletonDriver {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);
    }
}
