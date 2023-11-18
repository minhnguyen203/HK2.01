import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh c: ");
        double c = scanner.nextDouble();

        Tamgiac tamgiac = new Tamgiac(a, b, c);

        if (tamgiac.is_valid_triangle()) {
            System.out.println("Chu vi của tam giác là: " + tamgiac.chu_vi());
            System.out.println("Diện tích của tam giác là: " + tamgiac.dien_tich());
        } else {
            System.out.println("Ba giá trị không tạo thành một tam giác!");
        }

        scanner.close();
    }
}
