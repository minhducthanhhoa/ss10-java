package bai5;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.displayInfo();

        Cylinder cylinder = new Cylinder(5, 10);
        cylinder.displayInfo();

        System.out.println("\nCập nhật bán kính và chiều cao...");
        cylinder.setRadius(7);
        cylinder.setHeight(15);
        cylinder.displayInfo();

        System.out.println("\nThử đặt giá trị không hợp lệ...");
        cylinder.setRadius(-3);
        cylinder.setHeight(-5);
        cylinder.displayInfo();
    }
}
