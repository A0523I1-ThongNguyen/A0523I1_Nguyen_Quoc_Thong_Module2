package quan_li_phuong_tien_case_study.service;

import case_study.model.Employee;
import quan_li_phuong_tien_case_study.model.Manufacturer;
import quan_li_phuong_tien_case_study.model.Truck;
import quan_li_phuong_tien_case_study.model.Vehicle;
import quan_li_phuong_tien_case_study.repository.ITruckRepository;
import quan_li_phuong_tien_case_study.repository.ManuRepository;
import quan_li_phuong_tien_case_study.repository.TruckRepository;
import quan_li_phuong_tien_case_study.utils.ReadManu;

import javax.swing.*;
import java.util.*;

public class TruckService extends VehicleService implements ITruckService {
    private static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\quan_li_phuong_tien_case_study\\data\\xeTai.csv";

    Scanner scanner = new Scanner(System.in);
    ITruckRepository iTruckRepository = new TruckRepository();
    /*arrayListTruck sẽ lấy hết dữ liệu của iTruckRepository.getListTruck() và iTruckRepository.getListTruck() sẽ bị thay đổi theo arrayListTruck không?
     Không, arrayListTruck chỉ lấy hết dữ liệu của iTruckRepository.getListTruck() trong thời điểm gọi phương thức và không ảnh hưởng đến iTruckRepository.getListTruck(). Bất kỳ thay đổi nào thực hiện trên arrayListTruck sẽ không ảnh hưởng đến dữ liệu trong iTruckRepository.getListTruck().*/
    ArrayList<Truck> arrayListTruck = iTruckRepository.getListTruck();
    ManuRepository manuRepository = new ManuRepository();
    ArrayList<Manufacturer> listManu = manuRepository.getListManu();

    @Override
    public void showTruck() {
        Collections.sort(arrayListTruck);
        for (Truck tr : arrayListTruck) {
            System.out.println(tr);
        }
    }

    //bienSo, tenHang, namSanXuat, chuSoHuu);
//        this.trongTai = trongTai;
    @Override
    public void addTruck() {

//test xem add la list de ghi ds cho all method khac lien ket k
        System.out.println("Nhap bien so");
        String newBSX = scanner.nextLine();



        for (Manufacturer manu: listManu){
            System.out.println(manu);
        }
        System.out.println("Nhap name brand");
        String newNameBrand = scanner.nextLine();
        String st ="";
        for (Manufacturer manu: listManu){
            if (manu.getNameBrand().equals(newNameBrand)){
                st = manu.toString();
            }
        }

        System.out.println("Nhap nam san xuat");
        String newNSX = scanner.nextLine();
        System.out.println("Nhap chu so huu");
        String newChuSohuu = scanner.nextLine();
        System.out.println("Nhap trong tai");
        Double newTrongTai = Double.parseDouble(scanner.nextLine());
        Truck newTruck = new Truck(newBSX, st, newNSX, newChuSohuu, newTrongTai);
        arrayListTruck.add(newTruck); // tao thu 1 arrayList khac thay arrayListTruck
        iTruckRepository.writeTruckToFile(arrayListTruck, FILE_PATH, false);// truyen arraylist moi vo day
    }

    public void deleteTruck() {
        System.out.println("Nhập vào Bien so muốn xoa : ");
        String bs = scanner.nextLine();
        Truck indexTruckDel = null;

        for (Truck tr : arrayListTruck) {
            if (tr.getBienSo().equals(bs)) {
                indexTruckDel = tr;
            }
        }
        if (indexTruckDel == null) { // k tim thay thi return
            System.out.println("license plate " + bs + " does not exits");
            return;
        }
        System.out.println("Do you want to delete the Truck with license plate? " + bs + ".Yes=delete");
        String yes = scanner.nextLine();

        if (yes.equals("Yes")) {
            arrayListTruck.remove(indexTruckDel);
            iTruckRepository.writeTruckToFile(arrayListTruck, FILE_PATH, false);
        } else {
            System.out.println("You don't delete it");

        }
    }

    public void deleteTruck2() {
        System.out.println("Nhap trong tai muon xoa");
//        Double trongTai = Double.parseDouble(scanner.nextLine());
//        Truck truckDel = new Truck(trongTai);
//        arrayListTruck.remove(truckDel);
        String nameHangDel = scanner.nextLine();
        Truck truckDel2 = new Truck(nameHangDel);
        boolean test = arrayListTruck.remove(truckDel2);//xóa đối tương "truckDel2" nếu có cùng giá trị của thuộc tính tenHang khỏi ArrayList "arrayListTruck". Kết quả trả về là "true" nếu phần tử được xóa thành công và "false" nếu không tìm thấy phần tử trong ArrayList.
        if (!test) {
            System.out.println("name does exist");
        }
        iTruckRepository.writeTruckToFile(arrayListTruck, FILE_PATH, false);
    }

    @Override
    public void editTruck() {
        System.out.println("Nhap vao bien so xe tai muon sua");
        String bs = scanner.nextLine();
        Truck objTruck = null;
        for (Truck tr : arrayListTruck){
            if (tr.getBienSo().equals(bs)){
                objTruck = tr;
            }
        }
        int indexObjTruck  = arrayListTruck.indexOf(objTruck);
        if (indexObjTruck == -1){
            System.out.println("xe tai khong ton tai");
            return;
        }
        boolean isExits = false;
        int choose;
        do {
            System.out.println(arrayListTruck.get(indexObjTruck));
            System.out.println("Nhập thông tin muốn sửa!!");
            System.out.println("1.bien so");

            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                System.out.println("nhap bien so moi");
                String newBSX = scanner.nextLine();
                arrayListTruck.get(indexObjTruck).setBienSo(newBSX);
                break;
                case 2:
                iTruckRepository.writeTruckToFile(arrayListTruck,FILE_PATH,false);
                showTruck();
                isExits =true;
                break;
                }
        }while (!isExits);
    }


    @Override
    void show() {
        Collections.sort(arrayListTruck);
        for (Truck tr : arrayListTruck) {
            System.out.println(tr);
        }
    }
}
