package pl.sda.javalondek4.java_demo.office_example;
import java.util.UUID;
public class ItEmployee extends Employee {
    public ItEmployee(String name, String surname, int age, String insuranceNumber, UUID employeeId, long salary) {
        super(name, surname, age, insuranceNumber, employeeId, salary);
    }
    @Override
    public long getBonus() {
        return 1000;
    }
}
