package quan_li_phuong_tien_case_study.controller;

import quan_li_phuong_tien_case_study.model.Truck;
import quan_li_phuong_tien_case_study.service.*;

import java.util.Scanner;

public class AddVehiclesController {
    static Scanner scanner = new Scanner(System.in);
    private ITruckService iTruckService = new TruckService();
    private ICarService iCarService = new CarService();
    private IMotoService iMotoService = new MotoService();

    public void addVehicles() {
        int choose;
        do {
            System.out.println("---Choose Option---");
            System.out.println("1.Add Truck");
            System.out.println("2.Add Car");
            System.out.println("3.Add Moto");
            System.out.println("4.Return Vehicle Controller");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTruckService.addTruck();
                    break;
                case 2:
                    iCarService.add();
                    break;
                case 3:
                    iMotoService.add();
                    break;
            }
        } while (choose >= 1 && choose <= 3);
    }
}
