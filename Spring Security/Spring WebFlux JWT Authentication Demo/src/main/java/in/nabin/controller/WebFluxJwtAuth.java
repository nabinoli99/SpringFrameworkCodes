package in.nabin.controller;

import in.nabin.util.JwtUtil;
import in.nabin.model.AuthRequest;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class WebFluxJwtAuth {

    // Simple in-memory user store
    private static final Map<String, String> USER_DB = new HashMap<>();

    static {
        USER_DB.put("nabin", "password123");
        USER_DB.put("admin", "adminpass");
    }

    @PostMapping("/login")
    public Mono<String> login(@RequestBody AuthRequest request) {
        if (isValid(request)) {
            return Mono.just(JwtUtil.generateToken(request.getUsername()));
        } else {
            return Mono.error(new RuntimeException("Invalid credentials"));
        }
    }

    //Implement isValid method
    private boolean isValid(AuthRequest request) {
        if (request == null) return false;
        String username = request.getUsername();
        String password = request.getPassword();

        return username != null
                && password != null
                && USER_DB.containsKey(username)
                && USER_DB.get(username).equals(password);
    }
}