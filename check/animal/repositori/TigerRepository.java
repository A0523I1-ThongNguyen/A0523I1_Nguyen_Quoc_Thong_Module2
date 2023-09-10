package animal.repositori;

import animal.model.Tiger;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class TigerRepository implements ITigerRepository {

    Scanner scanner = new Scanner(System.in);

    private static Tiger[] tigers = new Tiger[10];

    static {
        tigers[0] = new Tiger("Ho Trang", 3, "sanlvmax1");
        tigers[1] = new Tiger("Ho Van", 2, "sanlvmax2");
        tigers[2] = new Tiger("Ho Vang", 1, "sanlvmax3");

    }

    public Tiger[] getListTiger() {
        return tigers;
    }

    @Override
    public void add(Tiger tiger) {
        for (int i = 0; i < tigers.length; i++) {
            if (tigers[i] == null) {
                tigers[i] = tiger;
                break;
            }
        }
    }

    public void deleteTigerByName(String name) {
        for (int i = 0; i < tigers.length; i++) {
            if (tigers[i].getName().equals(name)) {
                tigers[i] = null;
                break;
            } else {
                System.out.println(name + " Khong ton tai");
                break;
            }
        }
    }

    public void editTiger(String name) {
        boolean check = false;
        for (int i = 0; i < tigers.length; i++) {
            if (tigers[i].getName().equals(name)) {
                System.out.println("Nhap ten moi");
                String nameNew = scanner.nextLine();
                tigers[i].setName(nameNew);
                check = true;
                break;
            }else {
                System.out.println(name + " Khong ton tai");
                break;
            }
        }


    }

    public void searchTiger(String name) {
        boolean check = false;
        for (int i = 0; i < tigers.length; i++) {
            if (tigers[i] != null) {
                if (name.equals(tigers[i].getName())) {
                    System.out.println("Ho ban tim la : " + tigers[i]);
                    check = true;
                    break;
                }
            }
        }
        if (!check) {
            System.out.println(name + " Khong ton tai");
        }
    }


}
