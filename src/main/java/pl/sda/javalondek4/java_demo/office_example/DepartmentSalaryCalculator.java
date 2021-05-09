package pl.sda.javalondek4.java_demo.office_example;

import java.util.List;

public class DepartmentSalaryCalculator {

    public long calculateSalaryForDepartment(List<? extends Employee> employees){

       return employees.stream().mapToLong(employee -> employee.getSalary())
                .sum();


    }
}
