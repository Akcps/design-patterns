package io.github.akcps.creational.builder;

public class PhoneDriverTest {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").setRam(4).setBatteryCapacity(5000).getPhone();
        System.out.println(phone);
    }
}
