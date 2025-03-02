import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        double dienTich = tinhDienTich(chieuDai, chieuRong);
        double chuVi = tinhChuVi(chieuDai, chieuRong);

        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Chu vi hình chữ nhật: " + chuVi);

        scanner.close();
    }

    public static double tinhDienTich(double dai, double rong) {
        return dai * rong;
    }

    public static double tinhChuVi(double dai, double rong) {
        return 2 * (dai + rong);
    }
}
