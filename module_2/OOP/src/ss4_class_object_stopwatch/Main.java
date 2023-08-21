package ss4_class_object_stopwatch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch rolex = new StopWatch();

        String condition1 ;
        // chua tim ra event khac of String
        do {
            System.out.println("Nhap khac 'start' de bat dau");
            condition1 = scanner.nextLine();
            if (condition1.equals("start")) {
                System.out.println("Muon chay phai nhap khac chu 'start'");
            }
        } while (condition1.equals("start"));

        rolex.start();
        String condition2;
        do {
            System.out.println("Nhap khac 'end' de ket thuc ");
            condition2 = scanner.nextLine();
            if (condition2 .equalsIgnoreCase("start") ) {
                System.out.println("Muon ket thuc phai nhap khac chu 'end'");
            }
        } while (condition2 .equalsIgnoreCase("start"));

        rolex.stop();


        System.out.println("Time da troi duoc " +rolex.getElapsedTime()+" miilliseconds");


    }
}
