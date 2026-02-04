package in.nabin.oauth_springsecurity.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AppController {

    @GetMapping("/")
    public String home() {
        return "Public Home Page";
    }

    @GetMapping("/hello")
    public String hello(@AuthenticationPrincipal OAuth2User principal) {
        // This gets your name from the Google Profile
        String name = principal.getAttribute("name");
        return "Hello " + name;
    }

    @GetMapping("/user")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttributes();
    }
}