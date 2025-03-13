package bai8;

public class Cat extends Animals{
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        if (furColor == null || furColor.isEmpty()) {
            System.err.println("Màu lông không được để trống.");
        }
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
