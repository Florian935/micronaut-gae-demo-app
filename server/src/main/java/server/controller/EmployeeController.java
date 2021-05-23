package server.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.reactivex.Single;
import server.domain.Employee;
import server.exception.EmployeeNotFoundException;

import java.util.UUID;

import static io.micronaut.http.MediaType.APPLICATION_JSON;
import static io.micronaut.http.MediaType.TEXT_PLAIN;

@Controller("/employee")
public class EmployeeController {

    @Produces({APPLICATION_JSON, TEXT_PLAIN})
    @Get
    public HttpResponse<Single<Employee>> getEmployee() {
        try {
            final Employee employee = new Employee(
                    UUID.randomUUID().toString(),
                    "Toto");
            final Single<Employee> employeeSingle = Single.just(employee);

            return HttpResponse.ok(employeeSingle);
        } catch (Exception ex) {
            throw new EmployeeNotFoundException();
        }

    }
}