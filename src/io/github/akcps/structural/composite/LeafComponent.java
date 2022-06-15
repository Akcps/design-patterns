package io.github.akcps.structural.composite;

public class LeafComponent implements Component {
    double price;
    String name;

    public LeafComponent(String name, double price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public double price() {
        return this.price;
    }

    @Override
    public String toString() {
        return "LeafComponent{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
