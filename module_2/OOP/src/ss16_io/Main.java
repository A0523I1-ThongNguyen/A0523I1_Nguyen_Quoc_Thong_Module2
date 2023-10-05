package ss16_io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void write(){
        List<String> stringList = new ArrayList<>();

        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap code");
        String code = scanner.nextLine();
        System.out.println("Nhap ten nuoc");
        String name = scanner.nextLine();

        National national = new National(id,code,name); // tao obj chua thong tin da nhap
        stringList.add(national.toString()); // them chuoi~ thong tin nhao vo stringList(Tương ứng với tham số List của hàm Write)
        ReadAndWrite.writeFile(stringList);

    }

    public static void main(String[] args) {
        write();
//        ReadAndWrite.readFile();
    }
}
