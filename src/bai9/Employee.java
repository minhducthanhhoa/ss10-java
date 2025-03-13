package bai9;

public class Employee {
    protected String name;
    protected String id;
    protected double salary;

    public Employee() {

    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Mã số: " + id + ", Lương: " + salary;
    }
}
