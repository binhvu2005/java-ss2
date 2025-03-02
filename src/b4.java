import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị boolean a (true/false): ");
        boolean a = scanner.nextBoolean();
        System.out.print("Nhập giá trị boolean b (true/false): ");
        boolean b = scanner.nextBoolean();
        System.out.print("Nhập giá trị boolean c (true/false): ");
        boolean c = scanner.nextBoolean();

        if (a && b) {
            System.out.println("Cả hai đều đúng");
        }

        if (a || b) {
            System.out.println("Ít nhất một đúng");
        }

        if (!a && b) {
            System.out.println("Không đúng");
        }

        System.out.println("Giá trị ban đầu của c: " + c);
        c = !c;
        System.out.println("Giá trị sau khi đảo ngược của c: " + c);

        scanner.close();
    }
}
