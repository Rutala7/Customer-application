package com.academy.entity;

import com.academy.exception.ValidationException;
import org.springframework.stereotype.Component;

@Component("customerAdultValidator")
public class CustomerAdultValidator extends Validator<Integer> {

    @Override
    public void validate(Integer age) {
        if (age < 18)
            throw new ValidationException("Customer is not adult. Age is: " + age);
    }
}
