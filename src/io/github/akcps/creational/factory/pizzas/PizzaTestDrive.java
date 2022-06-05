package io.github.akcps.creational.factory.pizzas;

public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        System.out.println("---------------------------------------------------------------");
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We got a " + pizza.getName());
        System.out.println(pizza);
        System.out.println();

        System.out.println("---------------------------------------------------------------");
        System.out.println();
        pizza = store.orderPizza("veggie");
        System.out.println("We got a " + pizza.getName());
        System.out.println(pizza);
        System.out.println();


    }
}
