import java.util.Scanner;

public class Phan_Tu_Lon_Nhat_Trong_Mang_2_Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot");
        int col = Integer.parseInt(scanner.nextLine());
        int array2C[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap phan tu vi tri thu ["+i+"]["+j+"]");
                array2C[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //in ra
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array2C[i][j] +" ");
            }
            System.out.println();
        }

        double max = array2C[0][0];
        int indexMaxRow = 0;
        int indexMaxCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array2C[i][j] > max ){
                    max = array2C[i][j];
                    indexMaxRow = i;
                    indexMaxCol = j;
                }
            }
        }
        System.out.println("Phan tu lon nhat la " + max + " | Tai Hang " + indexMaxRow + " - Cot " +indexMaxCol);
    }
}
