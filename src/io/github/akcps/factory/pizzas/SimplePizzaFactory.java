package io.github.akcps.factory.pizzas;

// responsible for creating pizza
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                System.out.println("Wrong choice");
        }
        return pizza;
    }
}
