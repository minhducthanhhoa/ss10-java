package bai4;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Lập trình Java", "Nguyễn Văn A", 199.99);
        book1.displayInfo();

        book1.setPrice(250.50);
        System.out.println("Giá sách sau khi cập nhật: " + book1.getPrice());

        book1.setPrice(-50);
        System.out.println("Giá sách sau khi thử cập nhật với giá âm: " + book1.getPrice());
    }
}
