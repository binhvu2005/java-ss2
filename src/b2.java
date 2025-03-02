import java.util.Scanner;
public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        if (b != 0) {
            double thuong = (double) a / b;
            int phanDu = a % b;
            System.out.println("Tổng: " + tong);
            System.out.println("Hiệu: " + hieu);
            System.out.println("Tích: " + tich);
            System.out.println("Thương: " + thuong);
            System.out.println("Phần dư: " + phanDu);
        } else {
            System.out.println("Lỗi: Không thể chia hoặc lấy phần dư khi b = 0.");
        }

        scanner.close();
    }
}
