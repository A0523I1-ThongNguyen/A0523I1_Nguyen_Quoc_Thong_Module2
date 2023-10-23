package quan_li_phuong_tien_case_study.controller;

import quan_li_phuong_tien_case_study.service.*;

import java.util.Scanner;

public class DeleteVehiclesController {
    static Scanner scanner = new Scanner(System.in);
    private ITruckService iTruckService = new TruckService();
    private ICarService iCarService = new CarService();
    private IMotoService iMotoService = new MotoService();

    public void delVehicles() {
        int choose;
        do {
            System.out.println("---Choose Option---");
            System.out.println("1.Delete Truck");
            System.out.println("2.Delete Car");
            System.out.println("3.Delete Moto");
            System.out.println("4.Return Vehicle Controller");

            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTruckService.deleteTruck();
                    break;
                case 2:
                    iCarService.del();
                    break;
                case 3:
                    iMotoService.del();
                    break;
            }


        } while (choose >=1 && choose <=3);
    }
}
