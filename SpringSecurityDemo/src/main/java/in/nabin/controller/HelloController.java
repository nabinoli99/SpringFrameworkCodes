package in.nabin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello()
    {
        return "Welcome! You are successfully authenticated.";
    }
    @GetMapping("/courses")
    public String courses()
    {
        return "No course you have purchased yet";
    }
}