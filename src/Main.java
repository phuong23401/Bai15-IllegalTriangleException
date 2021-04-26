import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ 1: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh thứ 2: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh thứ 3: ");
        int c = Integer.parseInt(scanner.nextLine());

        try {
            IllegalTriangle triangle = new IllegalTriangle(a, b, c);
            System.out.println(triangle);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
