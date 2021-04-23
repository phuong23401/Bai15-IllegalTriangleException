import java.util.Scanner;

public class IllegalTriangle extends IllegalTriangleExeption {
    public IllegalTriangle(String message, int perimeter, int area) {
        super(message, perimeter, area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ 1: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh thứ 2: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh thứ 3: ");
        int c = Integer.parseInt(scanner.nextLine());
    }

    public static void checkTriangle() {
        try {
            if ()
        }
    }
}
