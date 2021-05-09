package pl.sda.javalondek4.java_demo.office_example;
import java.util.UUID;
public abstract class Employee extends Person {
    private final UUID employeeId;
    private long salary;
    public abstract long getBonus();
    public Employee(String name, String surname, int age, String insuranceNumber, UUID employeeId, long salary) {
        super(name, surname, age, insuranceNumber);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public long calculateSalary() {
        return salary + getBonus();
    }
    public UUID getEmployeeId() {
        return employeeId;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
}