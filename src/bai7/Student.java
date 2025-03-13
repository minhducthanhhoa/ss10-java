package bai7;

public class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        if (name == null || name.isEmpty() || id == null || id.isEmpty() || gpa < 0 || gpa > 4.0) {
            System.err.println("Thông tin không hợp lệ!");
        }
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Tên không hợp lệ!");
            return;
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()) {
            System.out.println("Mã sinh viên không hợp lệ!");
            return;
        }
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4.0) {
            System.out.println("GPA không hợp lệ!");
            return;
        }
        this.gpa = gpa;
    }

    public String getDetails() {
        return "Tên: " + name + ", Mã SV: " + id + ", GPA: " + gpa;
    }
}
