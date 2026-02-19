package in.nabin.securedauthdemo.controller;

import in.nabin.securedauthdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

@Autowired
    private UserService userService;

    @GetMapping("/delete")
    public String deleteUser() {
        return userService.deleteUser();
    }

    @GetMapping("/view")
    public String viewUser() {
        return userService.viewUser();
    }
}
