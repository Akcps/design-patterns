package io.github.akcps.creational.singleton.doublelocking;

public class DoubleLockingSingletonDriver {
    public static void main(String[] args) {
        DoubleLockSingleton doubleLockSingleton = DoubleLockSingleton.getInstance();
        System.out.println(doubleLockSingleton);
    }
}
