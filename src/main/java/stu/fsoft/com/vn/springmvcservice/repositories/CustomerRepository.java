package stu.fsoft.com.vn.springmvcservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import stu.fsoft.com.vn.springmvcservice.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
