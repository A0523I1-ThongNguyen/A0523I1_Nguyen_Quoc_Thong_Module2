package ss10_dsa_linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList test = new MyLinkedList(10);
        test.addFirst(1);
        test.addFirst(2);
        test.addFirst(3);
        test.add(0,5);//
        test.add(3,7);
//        test.add(1,9);

        test.printList();
    }
}
