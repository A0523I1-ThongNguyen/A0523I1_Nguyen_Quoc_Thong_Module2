package thi_module2.repository;

import thi_module2.model.BenhAnThuong;
import thi_module2.read_write.ReadBenhAnThuong;
import thi_module2.read_write.WriteBenhAnThuong;

import java.util.ArrayList;

public class BenhAnThuongRepository implements IBenhAnThuongRepository {
    ReadBenhAnThuong readBenhAnThuong = new ReadBenhAnThuong();
    WriteBenhAnThuong writeBenhAnThuong = new WriteBenhAnThuong();

    @Override
    public ArrayList<BenhAnThuong> getListBenhAnThuong() {
        return readBenhAnThuong.readFile();
    }

    @Override
    public void writeBenhAnThuong(ArrayList<BenhAnThuong> list, String filePath, boolean append) {
        writeBenhAnThuong.writeFile(list, filePath, append);
    }
}
