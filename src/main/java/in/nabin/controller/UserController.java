package in.nabin.controller;

import in.nabin.entities.User;
import in.nabin.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // PostAuthorize examples
    // Returns user profile only if username matches logged-in user
    @GetMapping("/profile/{username}")
    public User getUserProfile(@PathVariable String username) {
        return userService.getUserProfile(username);
    }

    // Returns user only if they have ADMIN role
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // Returns user if requester is ADMIN or requesting their own profile
    @GetMapping("/anyprofile/{username}")
    public User getAnyUserProfile(@PathVariable String username) {
        return userService.getAnyUserProfile(username);
    }

    @GetMapping("/clear-auth")
    public ResponseEntity<String> clearAuth(HttpServletRequest request, HttpServletResponse response) {
        // Force browser to forget credentials
        response.setHeader("WWW-Authenticate", "Basic realm=\"Realm\"");
        response.setStatus(401);
        return ResponseEntity.status(401).body("Authentication cleared. Please refresh and login again.");
    }
}