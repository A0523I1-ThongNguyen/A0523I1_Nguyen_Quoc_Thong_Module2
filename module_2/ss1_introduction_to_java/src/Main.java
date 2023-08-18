import java.util.Scanner;
public class Main {
    static Scanner value=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the Row");
        int row = value.nextInt();
        System.out.println("enter the Col");
        int col = value.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("enter the element of Arr");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("the element" + i + ":");
                arr[i][j] = value.nextInt();

            }

        }
        System.out.println("the element you recent enter ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");


            }
            System.out.println("");

        }
        int index;

        System.out.println("select the column yot want to count here");
        index = value.nextInt();
        int total=0;

        for (int i = 0; i <arr.length ; i++) {
            total+=arr[i][index];

        }
        System.out.println(total);

    }

}






