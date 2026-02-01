package in.nabin.csrfdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/transfer")
    public String getTransfer() {
        return "This is a GET request";
    }

    @PostMapping("/transfer")
    public String postTransfer() {
        return "Money transferred via POST!";
    }
}