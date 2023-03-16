package com.academy.entity;

import com.academy.exception.ValidationException;
import org.springframework.stereotype.Component;

@Component("countryCodeValidator")
public class CountryCodeValidator extends Validator<String> {

    @Override
    public void validate(String countryCode) {
        if (!countryCode.isEmpty()) {
            try {
                CountryCode.valueOf(countryCode.toUpperCase());
            } catch (IllegalArgumentException e) {
                throw new ValidationException("Country code: %s, is not valid".formatted(countryCode));
            }
        }
    }
}
