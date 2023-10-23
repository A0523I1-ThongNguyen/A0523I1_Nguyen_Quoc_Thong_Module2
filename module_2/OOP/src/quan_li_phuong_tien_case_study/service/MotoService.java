package quan_li_phuong_tien_case_study.service;

import quan_li_phuong_tien_case_study.model.Moto;
import quan_li_phuong_tien_case_study.repository.IMotoRepository;
import quan_li_phuong_tien_case_study.repository.MotoRepository;
import ss12_java_collection_framework.array_list.model.Oto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotoService implements IMotoService {
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\quan_li_phuong_tien_case_study\\data\\moto.csv";
    IMotoRepository iMotoRepository = new MotoRepository();
    ArrayList<Moto> listMoto = iMotoRepository.getListMoto(FILE_PATH);

    @Override
    public void show() {
        for (Moto mo : listMoto) {
            System.out.println(mo);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhap bien so");
        String bsx = scanner.nextLine();
        System.out.println("Nhap ten hang~");
        String tenHang = scanner.nextLine();
        System.out.println("Nhap nam san xuat");
        String namSanXuat = scanner.nextLine();
        System.out.println("Nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhap cong suat");
        Double congSuat = Double.parseDouble(scanner.nextLine());
        Moto moto = new Moto(bsx, tenHang, namSanXuat, chuSoHuu, congSuat);
        listMoto.add(moto);

        iMotoRepository.writeMoto(FILE_PATH, listMoto, false);
    }

    @Override
    public void del() {
     //   Moto moto = new Moto();
        System.out.println("Nhap bien so muon xoa");
        String bsxOfObjectWantDel = scanner.nextLine();
        Moto motoDel = new Moto(bsxOfObjectWantDel);
//        if (bsxOfObjectWantDel.equals(moto.getBienSo())) {
//            System.out.println("Do you want to delete the vehicle with license plate " + bsxOfObjectWantDel + "?. Yes=delete");
//        }else {
//            System.out.println("Khong tim thay");
//        }
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equals("Yes")) {
            listMoto.remove(motoDel);
        } else {
            return;
        }
        iMotoRepository.writeMoto(FILE_PATH, listMoto, false);

    }
}
