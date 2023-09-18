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
        LinkedList<Oto> listOto = iOtoRepository.getListOto();
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
        Oto nameOto = new Oto(name);
        iOtoRepository.deleteOto(nameOto);
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
