package ss8_mvc_product_car.controller;

import ss8_mvc_product_car.service.CarService;
import ss8_mvc_product_car.service.ICarService;

import java.util.Scanner;

public class CarController {
    public static void showMenu() {
        CarService carService = new CarService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng xe:");
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
                    carService.show();
                    break;
                case 2:
                    System.out.println("Code chức năng thêm mới");
                    carService.add();
                    break;
                case 3:
                    System.out.println("Code chức năng xoá");
                    carService.delete();
                    break;
                case 4:
                    System.out.println("Code chức năng sửa");
                    carService.edit();
                    break;
                case 5:
                    System.out.println("Code chuc nang tim kiem");
                    carService.search();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
