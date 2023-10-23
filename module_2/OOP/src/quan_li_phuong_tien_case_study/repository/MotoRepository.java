package quan_li_phuong_tien_case_study.repository;

import quan_li_phuong_tien_case_study.model.Moto;
import quan_li_phuong_tien_case_study.utils.ReadCar;
import quan_li_phuong_tien_case_study.utils.ReadMoto;
import quan_li_phuong_tien_case_study.utils.WriteMoto;

import java.util.ArrayList;
import java.util.List;

public class MotoRepository implements IMotoRepository{
    @Override
    public ArrayList<Moto> getListMoto(String filePath) {
        return ReadMoto.readFile(filePath);
    }

    @Override
    public void writeMoto(String filePath, ArrayList<Moto> motoList, boolean append) {
        WriteMoto.writeFile(filePath,motoList,append);
    }
}
