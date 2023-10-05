package case_study.controller;

import java.util.Scanner;

public class EmployeeManagement {
    Scanner scanner = new Scanner(System.in);


    public void display(){
        int choose;
        do {
            System.out.println("-----MENU------");
            System.out.println("1.Display List Employee");
            System.out.println("2.Add New Employee");
            System.out.println("3.Edit Employee");
            System.out.println("4.Return Main Menu");
            System.out.println("---------------");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    int n = 0;
                    do {
                        
                    }while (n >=1 && n<=3);

                break;

                default:
                    break;
            }
        }while (choose>=1 && choose <=3);
    }
}
