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
        elements[size++] = e; // gắn e vào size ?
        return true;
    }

    public void getElements() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public void add(int index, T element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index : " + index + " Size: " + index);
        }
        if (size == elements.length) {
            capacity();
        }
        for (int i = size; index < i; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
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
