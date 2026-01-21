package in.hisabkitab.controller;

import in.hisabkitab.model.user.User;
import in.hisabkitab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        try {
            User savedUser = userService.registerUser(user);

            if (savedUser != null)
            {

                return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
            }
            else
            {

                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed");
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }
}
