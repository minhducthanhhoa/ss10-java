package bai8;

public class Dog extends Animals{
    private String breed;

    public Dog(){

    }

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
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
