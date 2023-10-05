package case_study.service;


import case_study.model.Customers;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomersRepository;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerService implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);
    ICustomersRepository iCustomersRepository = new CustomerRepository();
    ArrayList<Customers> customersList = iCustomersRepository.displayCustomers();
    @Override
    public void display() {
        for (Customers cu: customersList){
            System.out.println(cu);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhap ma Khach Hang");
        String maNV = maNV();
        System.out.println("Nhap ho ten");
        String fullName = scanner.nextLine();
        System.out.println("Nhap ngay sinh");
        String date = scanner.nextLine();
        System.out.println("Gioi tinh");
        String gender = scanner.nextLine();
        System.out.println("So CMND");
       // String cmnd = cmnd();
        System.out.println("Phone");
       // String phone = phone();
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Level Khach");
        String levelKhach = scanner.nextLine();
        System.out.println("Dia chi");
        String Address = scanner.nextLine();
    }

    public static String maNV(){
        String maNV;
        while (true){
            maNV = scanner.nextLine();
            String dn = "^NV-[0-9]{4}$";
            if (Pattern.matches(dn,maNV)){
                return maNV;
            }else {
                System.out.println("Ma Khach Hang KHONG hop le");
            }

        }
    }

    @Override
    public void editCustomers() {

    }
}
