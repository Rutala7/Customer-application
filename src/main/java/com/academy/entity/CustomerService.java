package com.academy.entity;

import com.academy.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerValidator customerValidator;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void insert(Customer customer) {
        customerValidator.validate(customer);

        Customer formattedCustomer = new Customer.Builder(
                capitalizeFirstLetter(customer.getFirstName()),
                capitalizeFirstLetter(customer.getLastName()),
                formatPersonalNumber(customer))
                .withAge(customer.getAge())
                .withCountryCode(customer.getCountryCode())
                .withMiddleName(customer.getMiddleName())
                .withMartialStatus(customer.getMaritalStatus())
                .build();

        customerRepository.insert(formattedCustomer);
    }

    private String capitalizeFirstLetter(String string) {
        if (string.isEmpty()) {
            return string;
        } else {
            return String.valueOf(string.charAt(0)).toUpperCase() + string.substring(1);
        }
    }

    private String formatPersonalNumber(Customer customer) {
        if (customer.getPersonalNumber().length() < 4) {
            return customer.getPersonalNumber();
        } else {
            return customer.getPersonalNumber().substring(0, 4) + "-" + customer.getPersonalNumber().substring(4);
        }
    }

    public void deleteById(String customerId) {
        customerRepository.deleteById(customerId);
    }
}
