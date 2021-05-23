package client.controller;

import client.client.EmployeeClient;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.reactivex.Single;

@Controller("/employee")
public class EmployeeController {

    private final EmployeeClient employeeClient;

    public EmployeeController(EmployeeClient employeeClient) {
        this.employeeClient = employeeClient;
    }

    @Produces
    @Get
    public Single<?> getEmployee() {
        try {
            return employeeClient.getEmployee();
        } catch (HttpClientResponseException ex) {
            return Single.just(String.format("Error: %s", ex.getMessage()));
        }
    }
}