package thi_module2.read_write;

import quan_li_phuong_tien_case_study.model.Truck;
import thi_module2.model.BenhAnThuong;
import thi_module2.model.BenhAnVIP;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteBenhAnThuong {
    public void writeFile(ArrayList<BenhAnThuong> listBenhAnThuong, String filePath, boolean append) {
        File file = new File(filePath);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (BenhAnThuong bat : listBenhAnThuong) {
                //super(soThuTu,maBenhAn,tenBenhNhan,ngayRaVien,ngayRaVien,lyDoNhapVien);
                //        this.phiNamVien = phiNamVien;
                bufferedWriter.write(bat.getSoThuTu() + "," + bat.getMaBenhAn() + "," + bat.getMaBenhNhan() + "," + bat.getTenBenhNhan() + "," + bat.getNgayNhapVien() + "," + bat.getNgayRaVien() + "," + bat.getLyDoNhapVien() + "," + bat.getPhiNamVien());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
