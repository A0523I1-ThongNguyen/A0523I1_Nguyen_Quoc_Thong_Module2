import java.util.Scanner;

public class bt_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;
        System.out.println("Nhap Dollar chuyen doi sang VND");
        double dola = Double.parseDouble(scanner.nextLine());
        System.out.println(dola + " Dollar = " + (dola * rate) + " VND");
        System.out.println("nhap VND chuyen doi sang Dollar");
        double vnd = Double.parseDouble(scanner.nextLine());
        System.out.println(vnd + " VND = " + (vnd / rate) + " Dollar");
    }


}

