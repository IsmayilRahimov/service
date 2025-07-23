package org.example.service.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
@RequiredArgsConstructor

public class HelloController {
    private final HelloService helloService;

    @GetMapping("/hello")

    public String Hello() {
        return helloService.printHello();
    }

    @GetMapping("/drivers")
    public String Drivers() {
        return helloService.helloDrivers();
    }

    @GetMapping("/writer")
    public String write() {
        return helloService.helloWriter();
    }
}
