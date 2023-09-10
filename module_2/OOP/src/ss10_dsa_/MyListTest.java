package ss10_dsa_;

import ss8_mvc_product_car.repository.ICarRepository;

import java.util.Objects;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arrlist = new MyList<>(5); // Interger la tham so cho kieu du~ lieu,  truyền constructor MyList vào đối tượng arraylist, constructor bắt buộc theo kiểu Interger thuộc kiểu dữ liệu Mylisst


        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(2,50);
//        arrlist.remove(3);
//        arrlist.add(20);
//        arrlist.clear();
        arrlist.add(2);


       arrlist.get();
    }

}

