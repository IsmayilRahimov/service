package org.example.service.service.impl;

import org.example.service.service.HelloService;
import org.springframework.stereotype.Service;

@Service

public class HelloServiceImpl implements HelloService {
    @Override
    public String printHello() {
        return "Hello Java";
    }

    @Override
    public String helloDrivers() {
        return "Hello Drivers";
    }
    @Override
    public String helloWriter() {
        return "Hello Writer";
    }
}
