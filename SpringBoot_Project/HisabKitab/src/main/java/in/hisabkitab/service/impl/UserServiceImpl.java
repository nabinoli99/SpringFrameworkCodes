package in.hisabkitab.service.impl;

import in.hisabkitab.model.user.User;
import in.hisabkitab.repository.UserRepository;
import in.hisabkitab.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
   private BCryptPasswordEncoder passwordEncoder;

    private UserRepository userRepository;

    @Override
    public User registerUser(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("ROLE_USER");
        return userRepository.save(user);
    }

    @Override
    public User loginUser(String email, String password)
    {
        return (User) userRepository.findByEmail(email).orElse(null);
    }
}
