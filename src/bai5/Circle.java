package bai5;

public class Circle {
    private double radius;

    private static final double PI = Math.PI;

    public Circle() {
        this.radius = 1.0; // Giá trị mặc định
    }

    public Circle(double radius) {
        setRadius(radius); // Kiểm tra hợp lệ khi gán giá trị
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Bán kính phải lớn hơn 0! Giữ nguyên giá trị cũ.");
        }
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public void displayInfo() {
        System.out.println("Hình tròn - Bán kính: " + radius + ", Diện tích: " + getArea());
    }
}
