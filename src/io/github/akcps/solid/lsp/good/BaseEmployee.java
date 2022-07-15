package io.github.akcps.solid.lsp.good;


public abstract class BaseEmployee {
    private String firstName;
    private String lastName;

    public BaseEmployee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
