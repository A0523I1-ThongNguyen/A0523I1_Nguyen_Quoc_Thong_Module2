package thi_module2.read_write;

import thi_module2.model.BenhAnThuong;
import thi_module2.model.BenhAnVIP;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReadBenhAnVip {
    private static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\thi_module2\\data\\benhanvip.csv";

    public ArrayList<BenhAnVIP> readFile() {
        ArrayList<BenhAnVIP>  listBenhAnVIP = new ArrayList<>();
        File file = new File(FILE_PATH);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {

                String[] array = line.split(",");
                BenhAnVIP bav = new BenhAnVIP();
                bav.setSoThuTu(Integer.parseInt(array[0]));
                bav.setMaBenhAn(array[1]);
                bav.setMaBenhNhan(array[2]);
                bav.setTenBenhNhan(array[3]);
                bav.setNgayNhapVien(LocalDate.parse(array[4]));
                bav.setNgayRaVien(LocalDate.parse(array[5]));
                bav.setLyDoNhapVien(array[6]);
                bav.setCacGoiVIP(array[7]);
                bav.setThoiHanVIP(LocalDate.parse(array[8]));

                listBenhAnVIP.add(bav);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listBenhAnVIP;
    }
}
