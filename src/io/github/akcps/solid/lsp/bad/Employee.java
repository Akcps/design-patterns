package io.github.akcps.solid.lsp.bad;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private Employee manager;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void assignManger(Employee manager) {
        this.manager = manager;
    }

    public Employee getManager() {
        return manager;
    }
}
