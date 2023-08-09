import java.util.Scanner;

public class bt_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("100 So nguyen to dau tien : ");
        int count = 0;


        while (count < 100) {
            boolean flag = true;
            if (count >= 2) {
                for (int i = 2; i < count; i++) {
                    if (count % i == 0) {
                        flag = false;
                    }
                }
                if (flag == true) {
                    System.out.println(count + " ");
                }
            }count++;
        }

    }
}




