package ss10_dsa_danhsach;

import ss10_dsa_.MyList;

public class TestMyList {
    public static void main(String[] args) {
        MyArrayList<Integer> obj = new MyArrayList<>();
        obj.add(2);
        obj.add(4);
        obj.add(6);
        obj.add(1, 3);
        // obj.clear();
        // obj.remove(2);
        // obj.clone();
        System.out.println(obj.contains(3));
        System.out.println(obj.indexOf(4));
        //obj.getElements();
    }
}
