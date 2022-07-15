package io.github.akcps.solid.lsp.bad;

public class Ceo extends Employee{
    public Ceo(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void assignManger(Employee manager) {
        System.out.println("No manager for CEO.");
        // throw new Exception("No manager for CEO.");
    }
}
