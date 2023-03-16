package com.academy.entity;

import com.academy.exception.ValidationException;
import org.springframework.stereotype.Component;

@Component("mandatoryValidator")
public class MandatoryCustomerValuesValidator extends Validator<Customer> {

    @Override
    public void validate(Customer customer) {
        if (customer.getPersonalNumber().isEmpty())
            throw new ValidationException("Missing personal number");

        if (customer.getFirstName().isEmpty())
            throw new ValidationException("Missing fist name");

        if (customer.getLastName().isEmpty())
            throw new ValidationException("Missing last name");
    }
}
