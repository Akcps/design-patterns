package io.github.akcps.factory.pizzafm;


// Responsible for Creating NY Style Pizza
public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                System.out.println("Wrong choice");
                return null;
        }
    }
}
