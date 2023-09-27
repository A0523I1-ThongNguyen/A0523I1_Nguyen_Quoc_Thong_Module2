package ss12_java_collection_framework.array_list.service;

import org.w3c.dom.ls.LSOutput;
import ss12_java_collection_framework.array_list.model.Oto;
import ss12_java_collection_framework.array_list.repository.IOtoRepository;
import ss12_java_collection_framework.array_list.repository.OtoRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class OtoService implements IOtoService{
    IOtoRepository iOtoRepository = new OtoRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        System.out.println("Nhap ten oto");
        String name =scanner.nextLine();
        System.out.println("Nhap Mo Ta");
        String describe = scanner.nextLine();
        System.out.println("Nhap Phan Khuc");
        String segment = scanner.nextLine();
        System.out.println("Nhap gia");
        int price = scanner.nextInt();
        Oto repOto = new Oto(name, describe,segment,price);
        iOtoRepository.addCar(repOto);
    }

    @Override
    public void display() {
        //Nếu không khai báo đối tượng listOto, chương trình sẽ không thể truy cập vào danh sách các đối tượng Oto và
        // không thể lặp qua từng phần tử trong danh sách để in ra màn hình.
        // Do đó, không có thông tin gì sẽ được in ra.
        LinkedList<Oto> listOto = iOtoRepository.getListOto();
        //Đoạn code trên khai báo một đối tượng LinkedList có tên là "listOto". LinkedList này được khai báo để chứa các đối tượng kiểu Oto. Để sử dụng LinkedList này, có thể sử dụng một đối tượng OtoRepository có tên là "iOtoRepository" và gọi phương thức "getListOto()" để lấy danh sách các đối tượng Oto từ OtoRepository và gán cho biến "listOto".
        for (Oto oto: listOto){
            System.out.println(oto);
        }
    }

    @Override
    public void checkEmpty() {
        System.out.println(iOtoRepository.checkEmptyOto());
    }

    @Override
    public void checkSize() {
        System.out.println(iOtoRepository.sizeOto());
    }

    @Override
    public void removeAll() {
        iOtoRepository.removeAllCar(); // k can sout, because class data is method void
    }

    @Override
    public void delOto() {
        System.out.println("Nhap ten oto muon xoa");
        String name =scanner.nextLine();
        Oto otoCu = new Oto(name);
        iOtoRepository.deleteOto(otoCu);
    }


    @Override
    public void searchOto() {
        System.out.println("Nhap ten xe can tim");
        String name = scanner.nextLine();
        iOtoRepository.searchOto(name);
    }

    @Override
    public void sortByPrice() {
        iOtoRepository.sortOtoByPrice();
        iOtoRepository.displayOto();
    }

    @Override
    public LinkedList<Oto> getList() {
        return iOtoRepository.getListOto();
    }
    public void edit(){
        System.out.println("Nhap ten xe muon edit");
        String name = scanner.nextLine();
        iOtoRepository.editCar(name);
    }
}
