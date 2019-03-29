package gour.indrajeet.repository;

import gour.indrajeet.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${usrName}")
    private String usrName;

    public List<Customer> findAll() {
        System.out.println(usrName);

        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstname("Indrajeet");
        customer.setLastname("Gour");

        customers.add(customer);
        return customers;
    }

}
