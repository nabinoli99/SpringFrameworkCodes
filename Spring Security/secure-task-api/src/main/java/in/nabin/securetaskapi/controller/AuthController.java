package in.nabin.securetaskapi.controller;

import in.nabin.securetaskapi.dto.AuthRequest;
import in.nabin.securetaskapi.entity.User;
import in.nabin.securetaskapi.repository.UserRepository;
import in.nabin.securetaskapi.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authManager;
    private final JwtService jwtService;
    private final UserRepository repo;
    private final PasswordEncoder encoder;

    public AuthController(AuthenticationManager authManager,
                          JwtService jwtService,
                          UserRepository repo, PasswordEncoder encoder) {
        this.authManager = authManager;
        this.jwtService = jwtService;
        this.repo = repo;
        this.encoder = encoder;
    }

    @PostMapping("/register")
    public String register(@RequestBody AuthRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(new BCryptPasswordEncoder().encode(request.getPassword()));
        user.setRole("USER");
        repo.save(user);
        return "User Registered Successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );
        UserDetails userDetails = repo.findByUsername(request.getUsername())
                .map(u -> new org.springframework.security.core.userdetails.User(
                        u.getUsername(),
                        u.getPassword(),
                        List.of()
                ))
                .orElseThrow();

        return jwtService.generateToken(userDetails.getUsername());
    }
}