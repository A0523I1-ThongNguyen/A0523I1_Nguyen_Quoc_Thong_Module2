import java.util.Arrays;
import java.util.Scanner;

public class Total_Definite_Column {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][];
        System.out.println("Nhap kich thuoc mang Row");
        int sizeRow = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap kich thuoc mang Col");
        int sizeCol = Integer.parseInt(scanner.nextLine());
        array = new int[sizeRow][sizeCol];

        //nhap cac phan tu mang;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap phan tu thu [" + i + "] [" + j + "]");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        //in ra
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int viTriCol;
        int sum = 0;
        System.out.println("Nhap vi tri cot muon tinh tong ");
        viTriCol = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
                sum += array[i][viTriCol];
            }
        System.out.println(sum);


    }
}
