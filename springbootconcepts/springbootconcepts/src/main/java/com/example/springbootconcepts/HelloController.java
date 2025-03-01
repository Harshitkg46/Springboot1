package com.example.springbootconcepts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}

@RestController
class HelloControllerParam {

    // Handle GET request with query parameter
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam(value = "name", defaultValue = "User") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
