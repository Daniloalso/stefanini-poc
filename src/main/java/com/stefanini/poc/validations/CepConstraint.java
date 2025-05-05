package com.stefanini.poc.validations;

import com.stefanini.poc.validations.impl.CepConstraintImpl;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CepConstraintImpl.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CepConstraint {

    String message() default "Cep não encontrado";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
