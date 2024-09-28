import java.util.Scanner;

public class ex226 {
    private static double d1st(double a, double b) {
        return -b + a;
    }

    private static void d2st(Scanner scanner) {
        System.out.print("Nhập a1, b1, c1: ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        System.out.print("Nhập a2, b2, c2: ");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();

        double D = a1 * b2 - a2 * b1;
        double D1 = c1 * b2 - c2 * b1;
        double D2 = a1 * c2 - a2 * c1;

        if (D != 0) {
            System.out.println("Hệ có nghiệm duy nhất: " + (D1 / D) + ", " + (D2 / D));
        } else if (D1 == 0 && D2 == 0) {
            System.out.println("Hệ có vô số nghiệm");
        } else {
            System.out.println("Hệ vô nghiệm");
        }
    }

    private static void ptb2(Scanner scanner) {
        System.out.print("Nhập a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;

        if (delta == 0) {
            System.out.println("Hệ có nghiệm duy nhất: " + (-b / (2 * a)));
        } else if (delta > 0) {
            System.out.println("Hệ có 2 nghiệm: " + 
                (-b + Math.sqrt(delta)) / (2 * a) + ", " + 
                (-b - Math.sqrt(delta)) / (2 * a));
        } else {
            System.out.println("Hệ vô nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập a, b cho phương trình bậc 1: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Không thể tính toán");
        } else {
            System.out.println("Kết quả phương trình bậc 1: " + d1st(a, b));
        }

        d2st(scanner);
        ptb2(scanner);
        scanner.close();
    }
}
