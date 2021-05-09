package pl.sda.javalondek4.java_demo.office_example;
import java.util.UUID;
public class SalesEmployee extends Employee {
    private long salesAmountPerMonth;
    public SalesEmployee(String name, String surname, int age, String insuranceNumber, UUID employeeId, long salary) {
        super(name, surname, age, insuranceNumber, employeeId, salary);
    }
    public long getSalesAmountPerMonth() {
        return salesAmountPerMonth;
    }
    public void setSalesAmountPerMonth(long salesAmountPerMonth) {
        this.salesAmountPerMonth = salesAmountPerMonth;
    }
    @Override
    public long getBonus() {
        return (long) (0.15 * salesAmountPerMonth);
    }
    @Override
    public String toString() {
        return "SalesEmployee{" +
                "salesAmountPerMonth=" + salesAmountPerMonth +
                "} " + super.toString();
    }
}