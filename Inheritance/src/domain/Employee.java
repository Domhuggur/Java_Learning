package domain;

public class Employee extends Person {
    private int idEmployee;
    private double salary;
    private static int employeeCounter;

    public Employee(){}
    public Employee(String name, char genre, int age, String address) {
        super(name, genre, age, address);
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}
