package bai7;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyễn Văn A", "SV123", 3.5);
        GraduateStudent gradStudent1 = new GraduateStudent("Trần Thị B", "SV456", 3.9, "AI và Machine Learning", "TS. Lê Văn C");

        System.out.println(student1.getDetails());
        System.out.println(gradStudent1.getDetails());
    }
}
