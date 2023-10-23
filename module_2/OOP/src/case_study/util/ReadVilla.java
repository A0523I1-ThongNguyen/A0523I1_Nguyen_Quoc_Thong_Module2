package case_study.util;

import case_study.model.Villa;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadVilla {
    private static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Villa.csv";

    public static LinkedHashMap<Villa, Integer> readFileVilla() {
        LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();
        File file = new File(filePath);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] strings = line.split(",");
                    Villa villa = new Villa();
                    villa.setCodeDichVu(strings[0]);
                    villa.setNameDichVu(strings[1]);
                    villa.setDienTichSuDung(Double.parseDouble(strings[2]));
                    villa.setChiPhiThue(Double.parseDouble(strings[3]));
                    villa.setSoLuongNguoiToiDa(Integer.parseInt(strings[4]));
                    villa.setKieuThue(strings[5]);
                    villa.setTieuChuanPhong(strings[6]);
                    villa.setDienTichHo(Double.parseDouble(strings[7]));
                    villa.setSoTang(Integer.parseInt(strings[8]));
                    villaIntegerLinkedHashMap.put(villa,villa.getUses());
//codeDichVu, maDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
//        this.tieuChuanPhong = tieuChuanPhong;
//        this.dienTichHo = dienTichHo;
//        this.soTang = soTang;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaIntegerLinkedHashMap;
    }
}
