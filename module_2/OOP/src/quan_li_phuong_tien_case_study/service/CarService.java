package quan_li_phuong_tien_case_study.service;

import quan_li_phuong_tien_case_study.model.Car;
import quan_li_phuong_tien_case_study.repository.CarRepository;
import quan_li_phuong_tien_case_study.repository.ICarRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class CarService implements ICarService {
    public static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\quan_li_phuong_tien_case_study\\data\\car.csv";
    Scanner scanner = new Scanner(System.in);
    ICarRepository iCarRepository = new CarRepository();

    ArrayList<Car> carArrayList = iCarRepository.getListCar(FILE_PATH);

    @Override
    public void show() {
        for (Car ca : carArrayList) {
            System.out.println(ca);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhap bien so");
        String bsx = scanner.nextLine();
        System.out.println("Nhap ten hang~ ");
        String tenHang = scanner.nextLine();
        System.out.println("Nhap nam san xuat");
        String namSX = scanner.nextLine();
        System.out.println("Nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhap so ghe");
        int soGhe = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu xe");
        String kieuXe = scanner.nextLine();
        Car newCar = new Car(bsx, tenHang, namSX, chuSoHuu, soGhe, kieuXe);
        // ArrayList<Car> test = new ArrayList<>();
        //        test.add(newCar);
        carArrayList.add(newCar);
        iCarRepository.writeCar(FILE_PATH, carArrayList, false);
    }

    @Override
    public void del() {
        System.out.println("Nhap bien so xe");
        String bsxDel = scanner.nextLine();
        Car varCar = null;
        for (Car ca : carArrayList) {
            if (ca.getBienSo().equals(bsxDel)) {
                varCar = ca; // tham chiếu đối tượng varCar đến cùng địa chỉ ô nhớ của đối tượng Car ca, khi xóa varCar là xóa mất địa chỉ ô nhớ. nên ca về null
            }
        }
        if (varCar == null) {
            System.out.println("license plate does not exist");
           return;
        }
        System.out.println("Do you want to delete the Car with lisence plate : " + bsxDel + " ?.Yes = delete ");
        String yes = scanner.nextLine();
        if (yes.equals("Yes")) {
            carArrayList.remove(varCar);
        }else {
            return;
        }
        iCarRepository.writeCar(FILE_PATH, carArrayList, false);
    }
}
