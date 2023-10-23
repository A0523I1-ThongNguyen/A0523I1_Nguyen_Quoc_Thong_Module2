package thi_module2.read_write;

import quan_li_phuong_tien_case_study.model.Truck;
import thi_module2.model.BenhAnThuong;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReadBenhAnThuong {
    private static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\thi_module2\\data\\benhanthuong.csv";

    public ArrayList<BenhAnThuong> readFile() {
        ArrayList<BenhAnThuong> listBenhAnThuong = new ArrayList<>();
        File file = new File(FILE_PATH);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                BenhAnThuong bat = new BenhAnThuong();
                bat.setSoThuTu(Integer.parseInt(array[0]));
                bat.setMaBenhAn(array[1]);
                bat.setMaBenhNhan(array[2]);
                bat.setTenBenhNhan(array[3]);
                bat.setNgayNhapVien(LocalDate.parse(array[4]));
                bat.setNgayRaVien(LocalDate.parse(array[5]));
                bat.setLyDoNhapVien(array[6]);
                bat.setPhiNamVien(Double.parseDouble(array[7]));
                listBenhAnThuong.add(bat);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listBenhAnThuong;
    }
}
