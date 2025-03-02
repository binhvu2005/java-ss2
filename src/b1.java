public class b1 {
    public static void main(String[] args) {
        // Khai báo biến
        int soNguyen;
        double soThuc;
        char kyTu;
        String chuoiKyTu;

        // Gán giá trị cho biến
        soNguyen = 10;
        soThuc = 5.5;
        kyTu = 'A';
        chuoiKyTu = "Xin chào, Java!";

        // Tính tổng hai số nguyên
        int soNguyen2 = 20;
        int tong = soNguyen + soNguyen2;

        // Tính diện tích hình tròn
        double banKinh = 3.0;
        double dienTich = Math.PI * Math.pow(banKinh, 2);

        // In kết quả ra màn hình
        System.out.println("Giá trị của biến số nguyên: " + soNguyen);
        System.out.println("Giá trị của biến số thực: " + soThuc);
        System.out.println("Giá trị của biến ký tự: " + kyTu);
        System.out.println("Giá trị của biến chuỗi: " + chuoiKyTu);
        System.out.println("Tổng của hai số nguyên: " + tong);
        System.out.println("Diện tích hình tròn có bán kính " + banKinh + " là: " + dienTich);
    }
}
