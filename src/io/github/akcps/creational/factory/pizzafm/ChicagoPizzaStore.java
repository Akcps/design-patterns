package io.github.akcps.creational.factory.pizzafm;

// Responsible for creating Chicago Style pizza.
public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                System.out.println("Wrong choice");
                return null;
        }
    }
}
