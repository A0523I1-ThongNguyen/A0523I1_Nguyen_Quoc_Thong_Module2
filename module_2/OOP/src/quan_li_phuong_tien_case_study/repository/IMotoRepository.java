package quan_li_phuong_tien_case_study.repository;

import quan_li_phuong_tien_case_study.model.Moto;

import java.util.ArrayList;
import java.util.List;

public interface IMotoRepository {
    ArrayList<Moto> getListMoto(String filePath);
    void writeMoto(String filePath,ArrayList<Moto> motoList, boolean append);
}
