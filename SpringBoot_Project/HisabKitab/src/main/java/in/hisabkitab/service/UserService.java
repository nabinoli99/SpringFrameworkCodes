package in.hisabkitab.service;

import in.hisabkitab.model.user.User;

public interface UserService
{
    User registerUser(User user);
    Object loginUser(String email, String password);
}
