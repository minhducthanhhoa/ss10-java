package bai8;

public class TestAnimals {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Dog dog2 = new Dog("Max", 2, "Bulldog");

        Cat cat1 = new Cat("Kitty", 1, "White");
        Cat cat2 = new Cat("Luna", 4, "Black");

        System.out.println("Thông tin về chó:");
        dog1.displayInfo();
        dog1.makeSound();

        System.out.println();
        dog2.displayInfo();
        dog2.makeSound();

        System.out.println("\nThông tin về mèo:");
        cat1.displayInfo();
        cat1.makeSound();

        System.out.println();
        cat2.displayInfo();
        cat2.makeSound();
    }
}
