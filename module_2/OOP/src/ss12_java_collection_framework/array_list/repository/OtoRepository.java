package ss12_java_collection_framework.array_list.repository;

import ss12_java_collection_framework.array_list.model.Oto;

import java.util.*;

public class OtoRepository implements IOtoRepository {
    // Queue danhSachOto được khởi tạo với kiểu LinkedList, tức là danh sách được triển khai dựa trên danh sách liên kết.
    // Vì vậy, danhSachOto sẽ chứa các đối tượng Oto theo thứ tự mà chúng được thêm vào.
    private static LinkedList   <Oto> danhSachOto = new LinkedList<>();//biến danhSachOto sẽ được sử dụng để lưu trữ một danh sách các đối tượng kiểu Oto dưới dạng hàng đợi(Queue).
                                                //"new LinkedList<>()" :tạo một đối tượng LinkedList mới
    static {
        danhSachOto.add(new Oto("Vios", "Sedan", "Hang B", 560)); //why bỏ new LinkedList<>() vẫn k lỗi
        danhSachOto.add(new Oto("Outlander", "MVP", "MVP-C", 920));
        danhSachOto.add(new Oto("K3", "Sedan", "Hang C", 770));
//        danhSachOto.add(1,new Oto("Elantra","Sedan","Hang C ", 750));
//        danhSachOto.addFirst(new Oto("innova"));
    }

    @Override
    public void addCar(Oto car)  {
        this.danhSachOto.add(car);
    }

    @Override
    public void displayOto() {
        for (Oto oto : danhSachOto) {
            System.out.println(oto);
        }
    }

    @Override
    public boolean checkEmptyOto() {
        return this.danhSachOto.isEmpty();
    }

    @Override
    public int sizeOto() {
        return this.danhSachOto.size();
    }

    @Override
    public void removeAllCar() {
        this.danhSachOto.removeAll(danhSachOto);
    }

    @Override
    public void deleteOto(Oto name) {
        danhSachOto.remove(name);
    }

    @Override
    public void searchOto(String name) {
        boolean check = false;
        for (Oto oto: danhSachOto){
            if (oto.getNameCar().equals(name)){
                System.out.println(oto);
                check = true;
            }
        } if (!check) {
            System.out.println(name + " Khong co trong list");
        }
    }

    @Override
    public void sortOtoByPrice() {
        Collections.sort(danhSachOto, new Comparator<Oto>() {//du lieu sap xep AND thuat toan sap xep Comparator
            @Override
            public int compare(Oto o1, Oto o2) {
                if (o1.getPriceCar()<o2.getPriceCar()){
                    return 1;
                } else if (o1.getPriceCar()>o2.getPriceCar()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
    public void editCar(String name){
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        for (int i = 0; i < getListOto().size(); i++) {
            if (danhSachOto.get(i).getNameCar().equals(name)){
                System.out.println("Nhap ten xe moi");
                String nameCar = scanner.nextLine();
                System.out.println("Nhap mo ta");
                String describe = scanner.nextLine();
                System.out.println("Nhap phan khuc ");
                String segment = scanner.nextLine();
                System.out.println("Nhap gia");
                int price = Integer.parseInt(scanner.nextLine());
                danhSachOto.get(i).setNameCar(nameCar);
                danhSachOto.get(i).setDescribe(describe);
                danhSachOto.get(i).setSegment(segment);
                danhSachOto.get(i).setPriceCar(price);
                check = true;
                break;
            }
        }if (!check){
            System.out.println(name + " Khong ton tai");
        }
    }

    @Override
    public LinkedList<Oto> getListOto() {
        return danhSachOto;
    }
}
