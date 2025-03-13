package bai10;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Thông tin từng hình:");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
}
