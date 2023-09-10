package ss8_MVC.controller;

import ss8_MVC.service.CustomerService;
import ss8_MVC.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    public static void showMenu() {
        ICustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Display" +
                    "\n 2.Add" +
                    "\n 3.Delete" +
                    "\n 4.Edit" +
                    "\n 5.Search"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Code chức năng hiển thị");
                    customerService.show();
                    break;
                case 2:
                    System.out.println("Code chức năng thêm mới");
                    customerService.add();
                    break;
                case 3:
                    System.out.println("Code chức năng xoá");
                    customerService.delete();
                    break;
                case 4:
                    System.out.println("Code chức năng sửa");
                   // customerService.edit();
                    break;
                case 5:
                    System.out.println("Code chuc nang tim kiem");
                    //
                default:
                    flag = false;
            }
        } while (flag);
    }
}
