package in.nabin.controller;

//import org.springframework.web.bind.annotation.GetMapping;
import in.nabin.entities.User;
import in.nabin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUserDetails(@RequestBody User user)
    {
         return userService.createUser(user);
    }
    @GetMapping("/user")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserDetails(@PathVariable int id)
    {
        User user = userService.getUserDetails(id).orElse(null);
        if(user!=null) {
            return ResponseEntity.ok().body(user);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserDetails(@PathVariable int id , @RequestBody User user)
    {
        User updateduser = userService.updateUserDetails(id,user);

        if(updateduser!=null)
        {
            return ResponseEntity.ok().body(updateduser);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("user/{id}")
    public String deleteUser(@PathVariable int id)
    {
        if (userService.checkIfUserExists(id))
        {
            userService.deleteUserDetails(id);
            return "User with ID " + id + " deleted successfully!";
        }
        else
        {
            return "Failed: User with ID " + id + " does not exist in the database.";
        }
    }
}
