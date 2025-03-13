package bai9;

public class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus; // Lương quản lý = lương cơ bản + thưởng
    }

    @Override
    public String toString() {
        return super.toString() + ", Tiền thưởng: " + bonus;
    }
}
