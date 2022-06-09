package io.github.akcps.creational.singleton.plain;

public class PlainSingletonDriver {
    public static void main(String[] args) {
        PlainSingleton plainSingleton = PlainSingleton.getInstance();
        System.out.println(plainSingleton);
    }
}
