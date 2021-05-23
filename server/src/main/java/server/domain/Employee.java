package server.domain;

import java.util.Objects;

public class Employee {
    private String uuid;
    private String name;

    public Employee() {
    }

    public Employee(String uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(uuid, employee.uuid) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
