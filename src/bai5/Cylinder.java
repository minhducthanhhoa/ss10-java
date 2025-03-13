package bai5;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Chiều cao phải lớn hơn 0! Giữ nguyên giá trị cũ.");
        }
    }


    public double getVolume() {
        return getArea() * height; // Thể tích = Diện tích đáy * Chiều cao
    }

    @Override
    public void displayInfo() {
        System.out.println("Hình trụ - Bán kính: " + getRadius() + ", Chiều cao: " + height + ", Thể tích: " + getVolume());
    }
}
