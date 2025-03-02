import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập số nguyên y: ");
        int y = scanner.nextInt();

        boolean isEqual = (x == y);
        boolean isNotEqual = (x != y);
        boolean isGreater = (x > y);
        boolean isLess = (x < y);
        boolean isGreaterOrEqual = (x >= y);
        boolean isLessOrEqual = (x <= y);

        System.out.println("x == y: " + isEqual);
        System.out.println("x != y: " + isNotEqual);
        System.out.println("x > y: " + isGreater);
        System.out.println("x < y: " + isLess);
        System.out.println("x >= y: " + isGreaterOrEqual);
        System.out.println("x <= y: " + isLessOrEqual);

        if (isGreater) {
            System.out.println("x lớn hơn y");
        } else if (isEqual) {
            System.out.println("x bằng y");
        } else {
            System.out.println("x nhỏ hơn y");
        }

        System.out.print("Nhập số thực a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số thực b: ");
        double b = scanner.nextDouble();
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        scanner.nextLine();
        System.out.print("Nhập chuỗi s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập chuỗi s2: ");
        String s2 = scanner.nextLine();
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        scanner.close();
    }
}
