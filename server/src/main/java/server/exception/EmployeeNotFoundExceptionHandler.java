package server.exception;


import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;

import javax.inject.Singleton;

@Produces
@Singleton
@Requires(classes = {EmployeeNotFoundException.class, ExceptionHandler.class})
public class EmployeeNotFoundExceptionHandler implements ExceptionHandler<EmployeeNotFoundException, HttpResponse<String>> {
    @Override
    public HttpResponse<String> handle(HttpRequest request, EmployeeNotFoundException exception) {
        return HttpResponse.notFound("Employee not found");
    }
}
