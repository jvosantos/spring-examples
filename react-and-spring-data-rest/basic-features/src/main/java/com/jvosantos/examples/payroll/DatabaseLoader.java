package com.jvosantos.examples.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        repository.save(new Employee("Vasco", "Santos", "Java Dark lord of the Obscure Programming"));
        repository.save(new Employee("Angelo", "Veiga", "Knight Programmer"));
        repository.save(new Employee("Luis", "Prates", "Java Lord Programmer"));
    }
}
