package thi_module2.repository;

import thi_module2.model.BenhAnVIP;

import java.util.ArrayList;

public interface IBenhAnVipRepository {
    ArrayList<BenhAnVIP> getListBenhAnVip();
    void writeBenhAnVip(ArrayList<BenhAnVIP> list , String filePath, boolean append);
}
