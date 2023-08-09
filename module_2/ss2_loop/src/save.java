import java.util.Scanner;

public class save {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong SNT can in");
        int numbers = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int N = 2;
        while (count < numbers) {
            boolean flag = true;
            if (N >= 2) {
                for (int i = 2; i < N; i++) {
                    if (N % i == 0) {
                        flag = false;
                    }
                }
                if (flag == true) {
                    System.out.println(N + " ");
                    count++;
                }
                N++;
            } //N++

        }
    }
}
