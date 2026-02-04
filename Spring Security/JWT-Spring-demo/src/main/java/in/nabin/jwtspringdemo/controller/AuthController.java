package in.nabin.jwtspringdemo.controller;

import in.nabin.jwtspringdemo.model.AuthRequest;
import in.nabin.jwtspringdemo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request) {

        // TEMP: hard-coded user for learning
        if ("nabin".equals(request.getUsername())
                && "1234".equals(request.getPassword())) {

            String token = jwtUtil.generateToken(request.getUsername());

            return ResponseEntity.ok(
                    Map.of("token", token)
            );
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("Invalid username or password");
    }
}
