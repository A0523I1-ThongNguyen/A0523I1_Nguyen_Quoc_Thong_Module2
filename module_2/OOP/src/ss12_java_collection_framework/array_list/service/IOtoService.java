package ss12_java_collection_framework.array_list.service;

import ss12_java_collection_framework.array_list.model.Oto;

import java.util.ArrayList;
import java.util.LinkedList;

public interface IOtoService {
    void add();
    void display();
    void checkEmpty();
    void checkSize();
    void removeAll();
    void delOto();

    void searchOto();
    void sortByPrice();
    LinkedList<Oto> getList();
    void edit();
}
