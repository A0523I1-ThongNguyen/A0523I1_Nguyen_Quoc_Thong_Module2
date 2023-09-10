package ss8_MVC.service;

import ss8_MVC.model.Customer;
import ss8_MVC.repository.CustomerRepository;
import ss8_MVC.repository.ICustomerRepository;

import java.util.Scanner;


public class CustomerService implements ICustomerService {
    Scanner scanner = new Scanner(System.in);

    private ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void show() {
        Customer[] customers = customerRepository.getListCustomer();
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                System.out.println((i + 1) + ". " + customers[i]);
            }
        }

    }

    @Override
    public void add() {
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten khac hang");
        String nameCustomer = scanner.nextLine();
        System.out.println("Nhap ten san pham");
        String product = scanner.nextLine();
        System.out.println("Nhap gia");
        double price = Integer.parseInt(scanner.nextLine());

        Customer customer = new Customer(id, nameCustomer, product, price);
        customerRepository.addCustomer(customer);

    }

    @Override
    public void delete() {
        System.out.println("Nhap ID khach hang can xoa");
        int deleteId = Integer.parseInt(scanner.nextLine());
        customerRepository.deleteCustomerById(deleteId);
    }
}

