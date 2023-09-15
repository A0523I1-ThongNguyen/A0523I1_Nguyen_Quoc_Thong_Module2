package ss12_java_collection_framework.array_list.repository;

import ss12_java_collection_framework.array_list.model.Oto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface IOtoRepository {
     void addCar(Oto car); // kiểu dữ liệu ô tô là vì thêm vào thông tin đầy đủ của 1 chiếc oto
     void displayOto();
     boolean checkEmptyOto();
     int sizeOto();
     void removeAllCar();
     void deleteOto(Oto name); // kiểu dữ liệu là ô tô bởi vì muốn xóa hết 1 chiếc ô tô
     void searchOto(String name);// kiểu String vì tìm tên sẽ ra hết thông tin xe,kiểu dữ liệu String đơn giản là chỉ cần tìm tên ,mà tên là 1 chuỗi String nên tìm = String sẽ in ra cả thông tin xe
     void sortOtobyprice();

     LinkedList<Oto> getListOto();
     void editCar(String name);
}