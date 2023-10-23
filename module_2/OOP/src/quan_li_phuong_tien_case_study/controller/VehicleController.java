package quan_li_phuong_tien_case_study.controller;

import quan_li_phuong_tien_case_study.service.CarService;
import quan_li_phuong_tien_case_study.service.ITruckService;
import quan_li_phuong_tien_case_study.service.MotoService;
import quan_li_phuong_tien_case_study.service.TruckService;

import java.util.Scanner;

public class VehicleController {

    Scanner scanner = new Scanner(System.in);

    public void showMenu() {


        int choose;
        do {
            System.out.println("---Choose Option---");
            System.out.println("1.Hiện thị phương tiện");
            System.out.println("2.Thêm mới phương tiện");
            System.out.println("3.Xóa phương tiện");
//            System.out.println("4.delete all");
            System.out.println("4.exit");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    ShowVehiclesController showVehiclesController = new ShowVehiclesController();
                    showVehiclesController.showVehicle();
                    break;
                case 2:
                    AddVehiclesController addVehiclesController = new AddVehiclesController();
                    addVehiclesController.addVehicles();
                    break;

                case 3:
                    DeleteVehiclesController deleteVehiclesController  = new DeleteVehiclesController();
                    deleteVehiclesController.delVehicles();
                    break;
                case 4:
                    TruckService truckService = new TruckService();
                    truckService.editTruck();
                    break;

                default:
                    System.out.println("End Program");
                    break;
            }
        } while (choose >= 1 && choose <= 3);
    }
}
