package thi_module2.service;

import thi_module2.model.BenhAnThuong;
import thi_module2.model.BenhAnVIP;
import thi_module2.repository.BenhAnThuongRepository;
import thi_module2.repository.BenhAnThuongRepository;
import thi_module2.repository.IBenhAnThuongRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BenhAnThuongService implements IBenhAnThuongService {
    private static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\thi_module2\\data\\benhanthuong.csv";

    static Scanner scanner = new Scanner(System.in);
    IBenhAnThuongRepository iBenhAnThuongRepository = new BenhAnThuongRepository();
    ArrayList<BenhAnThuong> listBenhAnThuong = iBenhAnThuongRepository.getListBenhAnThuong();

    @Override
    public void add() {
        try {


            System.out.println("So thu tu benh an");
            int stt = Integer.parseInt(scanner.nextLine());
            System.out.println("Ma Benh An");
            String maBenhAn = getMaBenhAn();
            System.out.println("Ma Benh Nhan");
            String maBenhNhan = getMaBenhNhan();
            System.out.println("Ten Benh Nhan");
            String name = fullName();
            System.out.println("Ngay Nhap Vien");
            LocalDate ngayNhapVien = LocalDate.parse(scanner.nextLine());
            System.out.println("Ngay ra vien");
            LocalDate ngayRaVien = LocalDate.parse(scanner.nextLine());
            System.out.println("Li Do Nhap Vien");
            String liDo = scanner.nextLine();
            System.out.println("Phi nam vien");
            Double phiNamVien = Double.parseDouble(scanner.nextLine());
            BenhAnThuong objBenhAnThuong = new BenhAnThuong(stt, maBenhAn, maBenhNhan, name, ngayNhapVien, ngayRaVien, liDo, phiNamVien);
            listBenhAnThuong.add(objBenhAnThuong);
            iBenhAnThuongRepository.writeBenhAnThuong(listBenhAnThuong, FILE_PATH, false);
        } catch (Exception e) {
            System.out.println("Nhap Khong dung dinh dang");
        }
    }

    @Override
    public void delete() {
        System.out.println("nhap vao ma benh nhan : ");
        String bs = scanner.nextLine();
        BenhAnThuong index = null;

        for (BenhAnThuong tr : listBenhAnThuong) {
            if (tr.getMaBenhNhan().equals(bs)) {
                index = tr;
            }
        }
        if (index == null) { // k tim thay thi return
            System.out.println("patient code " + bs + " does not exist");
            return;
        }
        System.out.println("Do you want to delete the patient code? " + bs + ".Yes=delete");
        String yes = scanner.nextLine();

        if (yes.equals("Yes")) {
            listBenhAnThuong.remove(index);
            System.out.println("Deleted successfully");
            iBenhAnThuongRepository.writeBenhAnThuong(listBenhAnThuong, FILE_PATH, false);
        } else {
            System.out.println("You don't delete it");
        }
    }


    @Override
    public void showListBenhAn() {
        for (BenhAnThuong bat : listBenhAnThuong) {
            System.out.println(bat);
        }
    }

    public static String getMaBenhAn() {
        String maNV;
        while (true) {
            maNV = scanner.nextLine();
            String mp = "^BA-[0-9]{3}$"; //Định nghĩa biểu thức chính quy mp để kiểm tra định dạng của CMND
            if (Pattern.matches(mp, maNV)) {
                return maNV;
            } else {
                System.out.println("Ma Benh An Khong hop le !!");
            }
        }
    }

    public static String getMaBenhNhan() {
        String maNV;
        while (true) {
            maNV = scanner.nextLine();
            String mp = "^BN-[0-9]{3}$"; //Định nghĩa biểu thức chính quy mp để kiểm tra định dạng của CMND
            if (Pattern.matches(mp, maNV)) {
                return maNV;
            } else {
                System.out.println("Mã Benh Nhan Không Hợp Lệ !!");
            }
        }
    }

    public static String fullName() {

        while (true) {
            String name = scanner.nextLine();
            String ok = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
            if (Pattern.matches(ok, name)) {
                return name;
            } else {
                System.out.println("In hoa mỗi chữ cái đầu tiên của tên !");
            }
        }
    }
}
