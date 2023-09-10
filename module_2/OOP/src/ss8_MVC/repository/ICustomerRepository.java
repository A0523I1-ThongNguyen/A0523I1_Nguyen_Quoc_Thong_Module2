package ss8_MVC.repository;

import ss8_MVC.model.Customer;

public interface ICustomerRepository {
    Customer[] getListCustomer();

    void addCustomer(Customer customer);

    void deleteCustomerById(int id);

    void editCustomerById(int id);

}
