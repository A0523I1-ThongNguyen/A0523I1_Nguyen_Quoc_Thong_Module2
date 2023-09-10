package ss8_MVC.repository;

import ss8_MVC.model.Customer;
import ss8_MVC.service.ICustomerService;

public class CustomerRepository implements ICustomerRepository {

    private static Customer[] customers =new Customer[10];
    static {
        customers[0] = new Customer(01,"ziza","Ao",250); //
        customers[1] = new Customer(02,"Nam","Quan",320);
        customers[2] = new Customer(03,"maruko","Giay",500);
    }
    @Override
    public Customer[] getListCustomer() {
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null){
                customers[i] = customer;
                break;
            }
        }
    }

    @Override
    public void deleteCustomerById(int id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId()==id){
                customers[i] = null;
                break;// why k co break khi xoa se loi~
            }
        }
    }

    @Override
    public void editCustomerById(int id){
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId()==id){
                customers[i] = new Customer();
            }
        }
    }
}
