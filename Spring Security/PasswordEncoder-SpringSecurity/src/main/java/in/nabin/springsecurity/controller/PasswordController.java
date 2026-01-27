package in.nabin.springsecurity.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {

    @GetMapping("/")
    public String name() {
        return "Home Page - public";
    }

    @GetMapping("/profile")
    public String profile(Authentication authentication) {
        if (authentication == null || !authentication.isAuthenticated()) {
            return "You are not logged in";
        }
        return "Hello " + authentication.getName();
    }

    @GetMapping("/admin")
    public String admin(Authentication authentication) {
        if (authentication == null || !authentication.isAuthenticated()) {
            return "You are not logged in";
        }
        return "Hello Dear! " + authentication.getName();
    }
}