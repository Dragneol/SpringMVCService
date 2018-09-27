package stu.fsoft.com.vn.springmvcservice.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import stu.fsoft.com.vn.springmvcservice.domain.Customer;
import stu.fsoft.com.vn.springmvcservice.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        System.out.println("Loading Customer Data : ");
//
//        Customer c1 = new Customer();
//        c1.setFirstName("foo");
//        c1.setLastName("bar");
//        customerRepository.save(c1);
//
//        Customer c2 = new Customer();
//        c2.setFirstName("bar");
//        c2.setLastName("foo");
//        customerRepository.save(c2);
//
//        System.out.println("Customer Saved : " + customerRepository.count());
    }
}
