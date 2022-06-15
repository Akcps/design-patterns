package io.github.akcps.structural.composite;

public class ComponentDriver {
    public static void main(String[] args) {
        Component hdd = new LeafComponent("Hard Drive", 4000.0);
        Component mouse = new LeafComponent("Mouse", 1500.0);
        Component monitor = new LeafComponent("Monitor", 20000.0);
        Component ram = new LeafComponent("RAM", 5000.0);
        Component cpu = new LeafComponent("CPU", 4500.0);

        CompositeComponent peripherals = new CompositeComponent("Peripheral Devices");
        CompositeComponent cabinet = new CompositeComponent("Cabinet");
        CompositeComponent motherboard = new CompositeComponent("Motherboard");

        CompositeComponent computer = new CompositeComponent("Computer");

        motherboard.addComponent(cpu);
        motherboard.addComponent(ram);

        System.out.println(motherboard);
        System.out.println(motherboard.price());

        peripherals.addComponent(mouse);
        peripherals.addComponent(monitor);

        cabinet.addComponent(hdd);
        cabinet.addComponent(motherboard);

        computer.addComponent(peripherals);
        computer.addComponent(cabinet);


        System.out.println(computer);
        System.out.println(computer.price());


    }
}
