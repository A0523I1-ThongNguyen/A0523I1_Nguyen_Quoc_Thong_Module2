package case_study.controller;

import case_study.model.Employee;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomersRepository;
import case_study.service.CustomerService;
import case_study.service.EmployeeService;
import case_study.service.ICustomerService;
import case_study.service.IEmployeeService;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        IEmployeeService iEmployeeService = new EmployeeService();
        ICustomerService iCustomerService = new CustomerService();
        int choose;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("ok, chon di");
            System.out.println("----------------");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    int n;
                    do {
                        System.out.println("-----MENU------");
                        System.out.println("1.Display List Employee");
                        System.out.println("2.Add New Employee");
                        System.out.println("3.Edit Employee");
                        System.out.println("4.Return Main Menu");
                        System.out.println("---------------");
                        n = Integer.parseInt(scanner.nextLine());
                        switch (n) {
                            case 1:
                                iEmployeeService.display();
                                break;
                            case 2:
                                iEmployeeService.add();
                                break;
                        }
                    } while (n >= 1 && n <= 3);
                case 2:
                    int n2;
                    do {
                        System.out.println("1. Display list customers\n" +
                                "2. Add new customer\n" +
                                "3. Edit customer\n" +
                                "4. Return main menu");
                        n2 = Integer.parseInt(scanner.nextLine());
                        switch (n2){
                            case 1:
                                iCustomerService.display();
                                break;
                        }
                    } while (n2 >= 1 && n2 <= 3);
            }
        } while (choose >= 1 && choose <= 5);
    }
}
