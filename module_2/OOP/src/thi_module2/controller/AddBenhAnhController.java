package thi_module2.controller;

import thi_module2.service.BenhAnThuongService;
import thi_module2.service.BenhAnVipService;

import java.util.Scanner;

public class AddBenhAnhController {
    Scanner scanner = new Scanner(System.in);

    BenhAnThuongService benhAnThuongService = new BenhAnThuongService();
    BenhAnVipService benhAnVipService = new BenhAnVipService();

    public void show() {
        int choose;
        do {
            System.out.println("---Choose Option---");
            System.out.println("1.ADD Benh An Thuong");
            System.out.println("2.ADD Benh An Vip");
            System.out.println("3.Return Quan Ly Benh An");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    benhAnThuongService.add();
                    break;
                case 2:
                    benhAnVipService.add();
                    break;


            }
        } while (choose >= 1 && choose <= 2);
    }
}
