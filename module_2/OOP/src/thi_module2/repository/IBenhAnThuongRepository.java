package thi_module2.repository;


import thi_module2.model.BenhAnThuong;

import java.util.ArrayList;

public interface IBenhAnThuongRepository {
    ArrayList<BenhAnThuong> getListBenhAnThuong();
    void writeBenhAnThuong(ArrayList<BenhAnThuong> list , String filePath, boolean append);
}
