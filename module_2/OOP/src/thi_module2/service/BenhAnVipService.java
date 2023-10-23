package thi_module2.service;

import thi_module2.model.BenhAn;
import thi_module2.model.BenhAnThuong;
import thi_module2.model.BenhAnVIP;
import thi_module2.repository.BenhAnVipRepository;
import thi_module2.repository.IBenhAnVipRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BenhAnVipService implements IBenhAnVipService {
    private static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\thi_module2\\data\\benhanvip.csv";
    static Scanner scanner = new Scanner(System.in);
    IBenhAnVipRepository iBenhAnVipRepository = new BenhAnVipRepository();
    ArrayList<BenhAnVIP> listBenhAnVip = iBenhAnVipRepository.getListBenhAnVip();

    @Override
    public void add() {
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
        System.out.println("Loai Vip");
        String loaiVIP = loaiVIP();
        System.out.println("Thoi han VIP");
        LocalDate thoiHanVIP = LocalDate.parse(scanner.nextLine());

        //int soThuTu, String maBenhAn,String maBenhNhan, String tenBenhNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, String cacGoiVIP, LocalDate thoiHanVIP
        BenhAnVIP objBenhAnVIP = new BenhAnVIP(stt, maBenhAn, maBenhNhan, name, ngayNhapVien, ngayRaVien, liDo, loaiVIP, thoiHanVIP);

        listBenhAnVip.add(objBenhAnVIP);
        iBenhAnVipRepository.writeBenhAnVip(listBenhAnVip, FILE_PATH, false);
    }


    @Override
    public void delete() {
        System.out.println("nhap vao ma benh nhan : ");
        String bs = scanner.nextLine();
        BenhAnVIP index = null;

        for (BenhAnVIP tr : listBenhAnVip) {
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
            listBenhAnVip.remove(index);
            iBenhAnVipRepository.writeBenhAnVip(listBenhAnVip, FILE_PATH, false);
        } else {
            System.out.println("You don't delete it");

        }
    }

    @Override
    public void showListBenhAn() {
        for (BenhAnVIP bav : listBenhAnVip) {
            System.out.println(bav);
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

    public static String loaiVIP() {
        System.out.println("Chon VIP");
        System.out.println("VIP1");
        System.out.println("VIP2");
        System.out.println("VIP3");
        System.out.println("===============");
        String gender1;
        do {
            gender1 = scanner.nextLine();
            if (gender1.equals("VIP1") || gender1.equals("VIP2") || gender1.equals("VIP3")) {
                return gender1;
            } else {
                System.out.println("Can only be : VIP1 , VIP2 , VIP3");
            }
        } while (true);

    }
}
