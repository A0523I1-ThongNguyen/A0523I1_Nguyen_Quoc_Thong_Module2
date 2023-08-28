import java.util.Scanner;

public class test2chieu {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int array[][];
        System.out.println("Nhap so hang");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot");
        int col = Integer.parseInt(scanner.nextLine());
        array = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap phan tu thu"+i+" " +j);
                array[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mang vua nhap ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println(" ");
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i==j){
                    sum += array[i][j];
                }
            }

        }   System.out.println(sum);
}
}