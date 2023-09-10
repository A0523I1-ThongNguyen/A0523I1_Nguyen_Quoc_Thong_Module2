package animal.Service;

import animal.model.Tiger;
import animal.repositori.ITigerRepository;
import animal.repositori.TigerRepository;

import java.util.Scanner;

public class TigerService implements ITigerService {

    ITigerRepository iTigerRepository = new TigerRepository();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void show() {
        Tiger[] tigers = iTigerRepository.getListTiger();
        for (int i = 0; i < tigers.length; i++) {
            if (tigers[i] != null){
                System.out.println(tigers[i]);
            }
        }
    }

    @Override
    public void add() {
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap skill");
        String skill = scanner.nextLine();
        Tiger tiger = new Tiger(name,age,skill);
        iTigerRepository.add(tiger);
    }

    @Override
    public void delete() {
        System.out.println("Nhap ten can xoa");
        String delName = scanner.nextLine();
        iTigerRepository.deleteTigerByName(delName);
    }

    @Override
    public void edit() {
        System.out.println("Nhap ten tiger can edit");
        String nameTigerEdit = scanner.nextLine();
        iTigerRepository.editTiger(nameTigerEdit);
    }

    @Override
    public void search() {
        System.out.println("Nham ten de check");
        String checkName = scanner.nextLine();
        iTigerRepository.searchTiger(checkName);
    }
}

