package quan_li_phuong_tien_case_study.controller;

import quan_li_phuong_tien_case_study.service.*;

import java.util.Scanner;

public class ShowVehiclesController {
    Scanner scanner = new Scanner(System.in);
    private TruckService iTruckService = new TruckService();
    private ICarService iCarService = new CarService();
    private IMotoService iMotoService = new MotoService();


    public void showVehicle() {
        int choose;
        do {
            System.out.println("---Choose Option---");
            System.out.println("1.Show Truck");
            System.out.println("2.Show Car");
            System.out.println("3.Show Moto");
            System.out.println("4.Return Vehicle Controller");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTruckService.showTruck();
                    break;
                case 2:
                    iCarService.show();
                    break;
                case 3:
                    iMotoService.show();
                    break;

            }
        } while (choose >= 1 && choose <= 3);
    }
}
