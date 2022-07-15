package io.github.akcps.solid.lsp.good;

public class EmployeeRunner {
    public static void main(String[] args) {
        BaseEmployee ceo = new Ceo("Jeff", "Bezos");
        System.out.println("FirstName: " + ceo.getFirstName());
        System.out.println("LastName: " + ceo.getLastName());

        System.out.println();

        EmployeeWithManager emp = new EmployeeWithManager("Agatha", "Martin", ceo);
        System.out.println("FirstName: " + emp.getFirstName());
        System.out.println("LastName: " + emp.getLastName());
        System.out.println("Manager: " + emp.getManager().getFirstName());

    }
}
