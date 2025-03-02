import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học sinh: ");
        String tenHocSinh = scanner.nextLine();

        System.out.print("Nhập điểm môn 1: ");
        double diem1 = scanner.nextDouble();
        System.out.print("Nhập điểm môn 2: ");
        double diem2 = scanner.nextDouble();
        System.out.print("Nhập điểm môn 3: ");
        double diem3 = scanner.nextDouble();

        double diemTrungBinh = (diem1 + diem2 + diem3) / 3;
        String xepLoai = xepLoaiHocSinh(diemTrungBinh);

        System.out.println("\nTên học sinh: " + tenHocSinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Xếp loại: " + xepLoai);

        scanner.close();
    }

    public static String xepLoaiHocSinh(double diemTB) {
        if (diemTB >= 8.0) {
            return "Giỏi";
        } else if (diemTB >= 6.5) {
            return "Khá";
        } else if (diemTB >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
}
