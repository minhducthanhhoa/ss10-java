package bai3;

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);

        System.out.println("Xe: " + myCar.getMake() + " " + myCar.getModel() + " - " + myCar.getYear());

        myCar.setYear(2030);

        myCar.setYear(2018);

        System.out.println("Xe sau khi cập nhật: " + myCar.getMake() + " " + myCar.getModel() + " - " + myCar.getYear());
    }
}
