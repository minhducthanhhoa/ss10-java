package bai9;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "E001", 5000);

        Manager mgr = new Manager("Alice Smith", "M001", 7000, 2000);

        Developer dev = new Developer("Bob Johnson", "D001", 6000, "Java");

        System.out.println("Thông tin nhân viên ban đầu:");
        System.out.println(emp);
        System.out.println(mgr);
        System.out.println(dev);

        emp.increaseSalary(500);
        mgr.increaseSalary(1000);
        dev.increaseSalary(800);

        System.out.println("\nThông tin nhân viên sau khi tăng lương:");
        System.out.println(emp);
        System.out.println(mgr);
        System.out.println(dev);
    }
}
