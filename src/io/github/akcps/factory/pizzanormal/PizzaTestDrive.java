package io.github.akcps.factory.pizzanormal;

public class PizzaTestDrive {
    public static void main(String[] args) {

        System.out.println("Ordered pizza");
        Pizza pizza = createPizza("veggie");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(pizza);
        System.out.println("Received pizza");
    }

    private static Pizza createPizza(String type) {
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
