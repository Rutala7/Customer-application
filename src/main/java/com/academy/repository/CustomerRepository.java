package com.academy.repository;

import com.academy.entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    public List<Customer> findAll();

    public void insert(Customer customer);

    public void deleteById(String customerId);
}
