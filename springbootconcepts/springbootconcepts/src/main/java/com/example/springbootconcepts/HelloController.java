package com.example.springbootconcepts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


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

@RestController
class HelloControllermark {

    // Handle GET request with path variable
    @GetMapping("/hello/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}


@RestController
class HelloControl {

    // Handle POST request to accept firstName and lastName in the request body
    @PostMapping("/hello/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}

@RestController
@RequestMapping("/hello")
class UC5 {

    @PutMapping("/put/{firstName}")
    public String updateGreeting(
            @PathVariable String firstName,
            @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
