package stu.fsoft.com.vn.springmvcservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stu.fsoft.com.vn.springmvcservice.domain.Customer;
import stu.fsoft.com.vn.springmvcservice.repositories.CustomerRepository;

@RestController
@RequestMapping("/demo")
public class UserController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(path = "/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewUser(@RequestParam String fname
            , @RequestParam String lname) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Customer n = new Customer();
        n.setFirstName(fname);
        n.setLastName(lname);
        customerRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Customer> getAllUsers() {
        // This returns a JSON or XML with the users
        return customerRepository.findAll();
    }
}
