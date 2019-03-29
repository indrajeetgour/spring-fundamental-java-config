package gour.indrajeet.service;

import gour.indrajeet.model.Customer;
import gour.indrajeet.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    // here we will have all the service logic on service tier

    // customer repo implementation
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){

    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using constructor injection!!");
        this.customerRepository = customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setter injection!!");
        this.customerRepository = customerRepository;
    }


    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
