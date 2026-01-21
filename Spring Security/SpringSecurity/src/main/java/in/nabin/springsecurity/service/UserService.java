package in.nabin.springsecurity.service;

import in.nabin.springsecurity.domain.Role;
import in.nabin.springsecurity.domain.User;

import java.util.List;

public interface UserService
{
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoletoUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();
}
