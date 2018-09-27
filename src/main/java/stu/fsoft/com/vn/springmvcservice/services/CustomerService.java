package stu.fsoft.com.vn.springmvcservice.services;

import stu.fsoft.com.vn.springmvcservice.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
