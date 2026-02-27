package in.nabin.securetaskapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TaskController {

    @GetMapping("/tasks")
    public String getTasks() {
        return "This is secured task data!";
    }
}