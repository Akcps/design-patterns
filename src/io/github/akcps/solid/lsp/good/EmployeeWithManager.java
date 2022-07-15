package io.github.akcps.solid.lsp.good;

public class EmployeeWithManager extends BaseEmployee {
    private BaseEmployee manager;

    public EmployeeWithManager(String firstName, String lastName, BaseEmployee manager) {
        super(firstName, lastName);
        this.manager = manager;
    }

    public BaseEmployee getManager() {
        return manager;
    }
}
