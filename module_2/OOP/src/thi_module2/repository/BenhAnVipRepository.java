package thi_module2.repository;

import thi_module2.model.BenhAnVIP;
import thi_module2.read_write.ReadBenhAnVip;
import thi_module2.read_write.WriteBenhAnVip;

import java.util.ArrayList;

public class BenhAnVipRepository implements IBenhAnVipRepository {
    ReadBenhAnVip readBenhAnVip = new ReadBenhAnVip();
    WriteBenhAnVip writeBenhAnVip = new WriteBenhAnVip();
    @Override
    public ArrayList<BenhAnVIP> getListBenhAnVip() {
        return readBenhAnVip.readFile();
    }

    @Override
    public void writeBenhAnVip(ArrayList<BenhAnVIP> list, String filePath, boolean append) {
            writeBenhAnVip.writeFile(list,filePath,append);
    }
}
