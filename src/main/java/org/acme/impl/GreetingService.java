package org.acme.impl;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.service.Greeting;

@ApplicationScoped
public class GreetingService implements Greeting {
    @Override
    public String greeting(String name) {
        return "hello "+ name;
    }
}
