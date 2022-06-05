package io.github.akcps.factory.pizzanormal;

public class PizzaTestDrive {
    public static void main(String[] args) {

        System.out.println("Ordered pizza");
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("veggie");

        System.out.println(pizza);
        System.out.println("Received pizza");
    }


}
