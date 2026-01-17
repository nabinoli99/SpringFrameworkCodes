package in.nabin.service;

import in.nabin.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService
{
    public User createUser(User user);
    public List<User> getAllUsers();
    public Optional<User> getUserDetails(int id);
    public User updateUserDetails(int id , User user);
    public void deleteUserDetails(int id);
    public boolean checkIfUserExists(int id);
}
