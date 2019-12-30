package codelean.service;

import codelean.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    static HashMap<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Kathy", "kathy@gmail.com", "Ha Noi"));
        customers.put(2, new Customer(2, "Jonh", "jonh@gmail.com", "Da Nang"));
        customers.put(3, new Customer(3, "ken", "ken@gmail.com", "Ho Chi Minh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
