package com.academy.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerValidator {

    @Autowired
    @Qualifier("mandatoryValidator")
    private final MandatoryCustomerValuesValidator mandatoryCustomerValuesValidator = new MandatoryCustomerValuesValidator();

    @Autowired
    @Qualifier("countryCodeValidator")
    private final CountryCodeValidator countryCodeValidator = new CountryCodeValidator();

    @Autowired
    @Qualifier("customerAdultValidator")
    private final CustomerAdultValidator customerAdultValidator = new CustomerAdultValidator();

    public void validate(Customer customer) {
        mandatoryCustomerValuesValidator.validate(customer);
        customerAdultValidator.validate(customer.getAge());
        countryCodeValidator.validate(customer.getCountryCode());
    }
}
