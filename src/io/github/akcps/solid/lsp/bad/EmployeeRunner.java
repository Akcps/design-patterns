package io.github.akcps.solid.lsp.bad;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee ceo = new Ceo("Jeff", "Bezos");
        System.out.println();

        Employee emp2 = new PermanentEmployee("Agatha", "Martin");
        emp2.assignManger(ceo);
        System.out.println("FirstName: " + emp2.getFirstName());
        System.out.println("LastName: " + emp2.getLastName());
        emp2.getHourlyRate();
        System.out.println("Manager: " + emp2.getManager().getFirstName());

        System.out.println();

        System.out.println("FirstName: " + ceo.getFirstName());
        System.out.println("LastName: " + ceo.getLastName());
        ceo.getHourlyRate();
        System.out.println("Manager: " + ceo.getManager().getFirstName());


    }
}
