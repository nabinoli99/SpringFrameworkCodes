package in.nabin.controller;



import in.nabin.entities.User;
import in.nabin.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // Accessible only to users with ROLE_USER
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public User getAdmin() {
        return userService.getAdmin();
    }

    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/user")
    public User getUser()
    {
        return userService.getUser();
    }

}