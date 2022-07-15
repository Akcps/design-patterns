package io.github.akcps.solid.lsp.good;

public class EmployeeRunner {
    public static void main(String[] args) {
        BaseEmployee ceo = new EmployeeWithoutManager("Jeff", "Bezos");
        System.out.println("FirstName: " + ceo.getFirstName());
        System.out.println("LastName: " + ceo.getLastName());

        System.out.println();

        EmployeeWithManager permanentEmployee = new EmployeeWithManager("Agatha", "Martin", ceo);
        System.out.println("FirstName: " + permanentEmployee.getFirstName());
        System.out.println("LastName: " + permanentEmployee.getLastName());
        System.out.println("Manager: " + permanentEmployee.getManager().getFirstName());

    }
}
