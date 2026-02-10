package in.nabin.sevice;

import in.nabin.entities.User;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public User getAdmin() {
        return new User(1L, "Nabkiran Oli", "ROLE_ADMIN");
    }

    public User getUser() {
        return new User(1L, "Nabin Oli", "ROLE_USER");
    }







    //
//    @PreAuthorize("hasRole('ADMIN')")
//    public String deleteUser() {
//        return "User Deleted Successfully";
//    }
//
//    @PreAuthorize("hasAnyRole('ADMIN','USER')")
//    public String viewUser() {
//        return "User Details";
//    }
//
//    @PostAuthorize("returnObject == authentication.name")
//    public String getUserProfile(String username)
//    {
//        System.out.println("Method executed , Sucessfully");
//        return username;
//    }
}
