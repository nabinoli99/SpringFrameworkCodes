package in.nabin.service;

import in.nabin.entities.User;
import in.nabin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserDetails(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUserDetails(int id, User newuser)
    {
       User userdata = userRepository.findById(id).orElse(null);

       if(userdata!=null)
        {
          return userRepository.save(newuser);
        }
       throw new RuntimeException("User not found with id : "+id);
    }

    @Override
    public void deleteUserDetails(int id)
    {
        userRepository.deleteById(id);
    }

    @Override
    public boolean checkIfUserExists(int id) {
        return userRepository.existsById(id);
    }
}
