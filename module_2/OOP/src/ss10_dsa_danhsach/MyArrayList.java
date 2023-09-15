package ss10_dsa_danhsach;

import java.util.Arrays;

public class MyArrayList<T> {
    private int size = 0;
    private Object[] elements;
    public static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public void capacity() {
        int newsize = elements.length * 2; // sao k phai tao ra MANG moi ?
        elements = Arrays.copyOf(elements, newsize); // dùng khi : kích cỡ mảng chứa đầy số phần tử thì tạo ra 1 mảng mới với độ dài gấp đôi, bỏ các thành phần mới vào hàm mới newsize
    }

    public boolean add(T e) {
        if (size == elements.length) { // nếu kích cỡ mảng  = số phần tử mảng thì gọi hàm capacity
            capacity();
        }
        elements[size++] = e; // gan phần tử "e" vào mảng "elements" tại vị trí "size" và sau đó tăng giá trị của "size" lên 1. Mục đích của việc tăng giá trị "size" là để lưu trữ số lượng phần tử trong mảng.
        return true;
    }

    public void getElements() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public void add(int index, T phanTu) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index : " + index + " Size: " + index);
        }
        if (size == elements.length) {
            capacity();
        }
        for (int i = size; index < i; i--) {//di chuyển tất cả các phần tử trong mảng "elements" từ vị trí "size" đến vị trí "index" sang phải một vị trí. Cụ thể, giá trị của phần tử tại vị trí "i-1" sẽ được gán cho phần tử tại vị trí "i". Điều này giúp dịch chuyển các phần tử để tạo chỗ trống để chèn phần tử mới vào vị trí "index".
            elements[i] = elements[i-1];
        }
        elements[index] = phanTu;// gán giá trị của biến "phanTu" vào mảng "elements" tại vị trí "index". Nghĩa là, nó thay thế giá trị hiện tại của phần tử tại vị trí "index
        size++;
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index : " + index + " Size: " + index);
        }
        if (size == elements.length) {
            capacity();
        }
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (T) elements;
    }

    public int size() {
        return size;
    }

    public T clone() {
        Object[] newElement = new Object[size];
        newElement = elements;
        return (T) elements;
    }

    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return  i;
            }
        }
        return -1;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] =null;
        }
    }
}
