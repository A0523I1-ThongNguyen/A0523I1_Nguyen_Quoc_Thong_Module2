package thi_module2.controller;

import thi_module2.service.BenhAnThuongService;
import thi_module2.service.BenhAnVipService;

import java.util.Scanner;

public class DeleteBenhAnCotrolller {
    public void delete() {
        Scanner scanner = new Scanner(System.in);

        BenhAnThuongService benhAnThuongService = new BenhAnThuongService();
        BenhAnVipService benhAnVipService = new BenhAnVipService();

        int choose;
        do {
            System.out.println("---Choose Option---");
            System.out.println("1.DeLete Benh An Thuong");
            System.out.println("2.Delete Benh An Vip");
            System.out.println("3.Return Quan Ly Benh An");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    benhAnThuongService.delete();
                    break;
                case 2:
                    benhAnVipService.delete();
                    break;

            }
        } while (choose >= 1 && choose <= 2);
    }
}

