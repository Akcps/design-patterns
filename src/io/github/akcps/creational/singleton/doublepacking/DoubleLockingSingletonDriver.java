package io.github.akcps.creational.singleton.doublepacking;

public class DoubleLockingSingletonDriver {
    public static void main(String[] args) {
        DoubleLockSingleton doubleLockSingleton = DoubleLockSingleton.getInstance();
        System.out.println(doubleLockSingleton);
    }
}
