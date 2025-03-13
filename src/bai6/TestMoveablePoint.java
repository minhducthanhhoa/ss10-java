package bai6;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        System.out.println("Điểm ban đầu: " + p1);

        MoveablePoint mp1 = new MoveablePoint(1, 2, 0.5, 0.5);
        System.out.println("Trước khi di chuyển: " + mp1);

        mp1.move();
        System.out.println("Sau khi di chuyển: " + mp1);

        System.out.println("\nCập nhật tốc độ...");
        mp1.setSpeed(1.5, -0.5);
        System.out.println("Sau khi cập nhật tốc độ: " + mp1);

        mp1.move();
        System.out.println("Sau khi di chuyển lần nữa: " + mp1);
    }
}
