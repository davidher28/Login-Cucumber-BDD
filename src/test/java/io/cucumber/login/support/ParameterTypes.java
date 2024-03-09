package io.cucumber.login.support;

import io.cucumber.login.Persona;
import io.cucumber.java.ParameterType;

public class ParameterTypes {
    @ParameterType("Pati|Javi")
    public Persona persona(String name) {
        return new Persona(name);
    }
}
