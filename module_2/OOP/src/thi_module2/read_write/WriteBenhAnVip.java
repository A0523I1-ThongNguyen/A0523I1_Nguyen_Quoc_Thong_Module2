package thi_module2.read_write;

import thi_module2.model.BenhAnThuong;
import thi_module2.model.BenhAnVIP;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteBenhAnVip {
    public void writeFile(ArrayList<BenhAnVIP> listBenhAnVip , String filePath , boolean append){
        File file = new File(filePath);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (BenhAnVIP bav : listBenhAnVip){
                // super(soThuTu, maBenhAn,maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
                //        this.cacGoiVIP = cacGoiVIP;
                //        this.thoiHanVIP = thoiHanVIP;
                bufferedWriter.write(bav.getSoThuTu()+","+bav.getMaBenhAn()+","+bav.getMaBenhNhan()+","+ bav.getTenBenhNhan()+","+bav.getNgayNhapVien()+","+bav.getNgayRaVien()+","+bav.getLyDoNhapVien()+","+ bav.getCacGoiVIP()+","+bav.getThoiHanVIP());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
