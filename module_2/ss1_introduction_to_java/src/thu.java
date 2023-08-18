import java.util.Arrays;
import java.util.Scanner;

public class thu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("So phan tu mang");
        int size = Integer.parseInt(scanner.nextLine());
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu "+i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
        }

        System.out.println("Nhap so can chen");
        int soCanChen = Integer.parseInt(scanner.nextLine());
        int viTriChen;

        do {System.out.println("Nhap vi tri can chen");
            viTriChen = Integer.parseInt(scanner.nextLine());
            if (viTriChen<=1 || viTriChen>= array.length-1){
                System.out.println("Vi tri chen phai >1 OR <= array.length-1");
            }
        }while (viTriChen<=1 || viTriChen>= array.length-1);

        int newArray[] = new int [size+1];
        for (int i = 0; i <= array.length; i++) {
            if (i < viTriChen){
                newArray[i] = array[i];
            } else if (i ==viTriChen) {
                newArray[i] = soCanChen;
            }else {
                newArray[i] = array[i-1];
            }
        }
        for (int show:newArray){
            System.out.println(show);
        }
    }
}
