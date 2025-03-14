package bai8;

public class Cat extends Animals{
    private String furColor;

    public Cat() {
    }

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Gọi phương thức của lớp cha
        System.out.println("Màu lông: " + furColor);
    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }
}
