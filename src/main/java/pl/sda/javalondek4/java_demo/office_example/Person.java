package pl.sda.javalondek4.java_demo.office_example;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String insuranceNumber;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                '}';
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }


    public Person(String name, String surname, int age, String insuranceNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.insuranceNumber = insuranceNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

}
