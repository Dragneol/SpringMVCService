package stu.fsoft.com.vn.springmvcservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import stu.fsoft.com.vn.springmvcservice.domain.Customer;
import stu.fsoft.com.vn.springmvcservice.services.CustomerService;
import stu.fsoft.com.vn.springmvcservice.services.CustomerServiceImpl;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/api/v1/customers";

    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomer() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        Customer tmp = (Customer) customerService.findCustomerById(id);
        return tmp;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (@RequestParam String fname
            , @RequestParam String lname) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Customer n = new Customer();
        n.setFirstName(fname);
        n.setLastName(lname);
        customerService.saveCustomer(n);
        return "Saved";
    }
}
