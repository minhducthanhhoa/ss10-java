package bai8;

public class Dog extends Animals{
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        if (breed == null || breed.isEmpty()) {
            System.err.println("Giống chó không được để trống.");
        }
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giống: " + breed);
    }

    @Override
    public String makeSound() {
        return "Woof Woof";
    }
}
