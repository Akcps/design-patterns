package io.github.akcps.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements Component {
    String name;
    List<Component> components;

    public CompositeComponent(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(Component c) {
        this.components.add(c);
    }

    @Override
    public double price() {
        double price = 0.0;
        for (Component c : this.components) {
            price += c.price();
        }
        return price;
    }

    @Override
    public String toString() {
        return "CompositeComponent{" +
                "name='" + name + '\'' +
                ", components=" + components +
                '}';
    }
}
