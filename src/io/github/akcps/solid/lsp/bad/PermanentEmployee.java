package io.github.akcps.solid.lsp.bad;

public class PermanentEmployee extends Employee{

    public PermanentEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void getHourlyRate() {
        System.out.println("Permanent Employee Hourly Rate is 30 $");
    }
}
