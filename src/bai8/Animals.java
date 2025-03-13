package bai8;

public class Animals {
    protected String name;
    protected int age;

    public Animals(String name, int age) {
        if (name == null || name.isEmpty()) {
            System.err.println("Tên không được để trống.");
        }
        if (age < 0) {
            System.err.println("Tuổi không thể là số âm.");
        }
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }

    public String makeSound() {
        return "Some generic sound";
    }
}
