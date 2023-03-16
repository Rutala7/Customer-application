package com.academy.entity;

import org.springframework.stereotype.Component;

@Component
public abstract class Validator<V> {

    public abstract void validate(V customer);
}
