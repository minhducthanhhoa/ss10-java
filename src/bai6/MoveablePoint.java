package bai6;

public class MoveablePoint extends Point {
    private double xSpeed;
    private double ySpeed;

    public MoveablePoint() {
        super(); // Gọi constructor của Point
        this.xSpeed = 0.0;
        this.ySpeed = 0.0;
    }

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y); // Gọi constructor của lớp cha Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double[] getSpeed() {
        return new double[]{xSpeed, ySpeed};
    }

    public void move() {
        setXY(getX() + xSpeed, getY() + ySpeed);
    }

    @Override
    public String toString() {
        return super.toString() + " with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}
