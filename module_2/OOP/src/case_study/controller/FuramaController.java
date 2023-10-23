package case_study.controller;

import case_study.model.DayComparator;
import case_study.model.Employee;
import case_study.repository.CustomerRepository;
import case_study.repository.FacilityRepository;
import case_study.repository.ICustomersRepository;
import case_study.repository.IFacilityRepository;
import case_study.service.*;

import java.util.Collections;
import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        IEmployeeService iEmployeeService = new EmployeeService();
        ICustomerService iCustomerService = new CustomerService();
        IFacilityService iFacilityService = new FacilityService();
        BookingService bookingService = new BookingService();

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
                                // StudentService.showStudent();
                                break;
                            case 2:
                                iEmployeeService.add();
                                break;
                            case 3:
                                iEmployeeService.editEmployee();
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                break;
                        }
                    } while (n >= 1 && n <= 3);
                    break;
                case 2:
                    int n2;
                    do {
                        System.out.println("1. Display list customers\n" +
                                "2. Add new customer\n" +
                                "3. Edit customer\n" +
                                "4. Return main menu");
                        n2 = Integer.parseInt(scanner.nextLine());
                        switch (n2) {
                            case 1:
                                iCustomerService.display();
                                break;
                            case 2:
                                iCustomerService.add();
                                break;
                            case 3:
                                iCustomerService.editCustomers();
                        }
                    } while (n2 >= 1 && n2 <= 3);
                    break;
                case 3:
                    int n3;
                    do {
                        System.out.println("1. Display list Flacity\n" +
                                "2. Add new Flacity\n" +
                                "3.Display list facility maintenance\n" +
                                "4. Return main menu");
                        n3 = Integer.parseInt(scanner.nextLine());
                        switch (n3) {
                            case 1:
                                iFacilityService.display();

                                break;
                            case 2:
                                iFacilityService.addVilla();

                                break;
                            case 3:
                                iFacilityService.addHouse();

                                break;

                        }
                    } while (n3 >= 1 && n3 <= 3);
                    break;
                case 4:
                    int n4;

                    do {
                        System.out.println("1. Display list Booking\n" +
                                "2. Add Booking\n" +
                                "3. Create new contracts\n" +
                                "4. Return main menu");
                        n4 = Integer.parseInt(scanner.nextLine());
                        switch (n4) {
                            case 1:
                                bookingService.showBooking();
                                break;
                            case 2:
                                bookingService.addBooking();
                                break;
                            case 3:
                                ContactService contactService = new ContactService();
                                contactService.creatContract();
                            break;


                        }
                    } while (n4 >= 1 && n4 <= 3);
                    break;

            }
        } while (choose >= 1 && choose <= 5);
    }
}
