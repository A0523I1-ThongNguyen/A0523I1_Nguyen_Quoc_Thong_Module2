import java.util.Arrays;
import java.util.Scanner;

public class Total_Duong_Cheo_Array2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][];
        System.out.println("Nhap so Hang");
        int sizeRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so Cot");
        int sizeCol = Integer.parseInt(scanner.nextLine());

        array = new int[sizeRow][sizeCol];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap phan tu mang thu ["+i+"] ["+j+"]");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

        int sum = 0;
        int indexRow =0;
        int indexCol = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j){
                    sum+= array[i][j];
                    indexRow = i;
                    indexCol = j;
                    System.out.println("Tinho vi tri " +indexRow + " "+indexCol+"\n");
                }
            }
        }
        System.out.println("Tong duong cheo " +sum);

    }
}
