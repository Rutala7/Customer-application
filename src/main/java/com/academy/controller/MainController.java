package com.academy.controller;

import com.academy.entity.Customer;
import com.academy.entity.CustomerService;
import com.academy.exception.CustomerNotAdultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer/all")
    public List<Customer> fetchCustomers() {
        return customerService.findAll();
    }

    @PostMapping("/customer/insert")
    public void insertCustomer(@RequestBody Customer customer) throws CustomerNotAdultException {
        customerService.insert(customer);
    }

    @DeleteMapping("/customer/delete/{customerId}")
    public void deleteCustomer(@PathVariable String customerId) {
        customerService.deleteById(customerId);
    }
}