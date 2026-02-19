package in.nabin.securedauthdemo.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Secured("ROLE_ADMIN")
    public String deleteUser() {
        return "User Deleted Successfully!";
    }

    public String viewUser() {
        return "User Viewed Successfully!";
    }
}
