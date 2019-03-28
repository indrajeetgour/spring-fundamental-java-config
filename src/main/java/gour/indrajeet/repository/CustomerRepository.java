package gour.indrajeet.repository;

import gour.indrajeet.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
