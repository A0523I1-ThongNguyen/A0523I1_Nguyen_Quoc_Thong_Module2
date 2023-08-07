import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dollar");
        double dola = Double.parseDouble(scanner.nextLine());
        System.out.println("Ty gia Dola vs VND " + dola*vnd);
        System.out.println("nhap VND");
        double vndToUsd = Double.parseDouble(scanner.nextLine());
        System.out.println("Ty gia VND sang Dollar " + vndToUsd / 23000);
    }




}
