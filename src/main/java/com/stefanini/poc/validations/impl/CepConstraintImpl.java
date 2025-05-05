package com.stefanini.poc.validations.impl;

import com.stefanini.poc.clients.CepClient;
import com.stefanini.poc.validations.CepConstraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.Annotation;

public class CepConstraintImpl implements ConstraintValidator<CepConstraint, String> {

    @Autowired
    private CepClient cepClient;

    private static final Logger log = LoggerFactory.getLogger(CepConstraintImpl.class);

    @Override
    public void initialize(CepConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        var cepDto = cepClient.buscarCep(value);

        return true;
    }


}
