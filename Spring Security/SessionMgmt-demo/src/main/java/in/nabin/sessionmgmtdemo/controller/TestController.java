package in.nabin.sessionmgmtdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestController
{

    @GetMapping("/whoami")
    public String whoami(Principal principal)
    {
        return "Logged in as: " + principal.getName();
    }
}
