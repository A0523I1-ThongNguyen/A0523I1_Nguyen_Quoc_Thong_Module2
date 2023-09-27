package ss15_exception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);

    }

    private void calculate(int x, int y) {


        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            int d = x / y; // bi bat loi
            System.out.println("Thương x / y = " + d);
        } catch (ArithmeticException e) { // bat loi khi nhap 0
            System.err.println("Xảy ra ngoại lệ: 0 khong the / 0");

        }
    }
}

