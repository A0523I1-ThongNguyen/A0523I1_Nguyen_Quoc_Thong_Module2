import java.util.Scanner;

public class max {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array[] = {1, 4, 2, 6};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("So lon nhat la " + max);
    }
}

