package bai10;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Hình tròn");
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bán kính: " + radius;
    }
}
