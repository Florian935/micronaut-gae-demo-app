package client.client;

import client.domain.Employee;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client("https://micronaut-tp.ew.r.appspot.com")
public interface EmployeeClient {

    @Get("/employee")
    Single<Employee> getEmployee();
}
