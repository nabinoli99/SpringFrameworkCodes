package in.nabin.springsecurity;

import in.nabin.springsecurity.domain.Role;
import in.nabin.springsecurity.domain.User;
import in.nabin.springsecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }


    @Bean
    CommandLineRunner run(UserService userService)
    {
        return args -> {
            userService.saveRole(new Role(null,"ROLE_USER"));
            userService.saveRole(new Role(null,"ROLE_MANAGER"));
            userService.saveRole(new Role(null,"ROLE_ADMIN"));
            userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null,"Nabin Oli","nabin","1234",new ArrayList<>()));
            userService.saveUser(new User(null,"Prakash Neupane","prakash","1234",new ArrayList<>()));
            userService.saveUser(new User(null,"Nabkiran Oli","nabkiran","1234",new ArrayList<>()));
            userService.saveUser(new User(null,"Diwash Basnet","diwash","1234",new ArrayList<>()));

           userService.addRoletoUser("diwash","ROLE_USER");
           userService.addRoletoUser("prakash","ROLE_MANAGER");
           userService.addRoletoUser("nabkiran","ROLE_ADMIN");
           userService.addRoletoUser("nabin","ROLE_SUPER_ADMIN");
           userService.addRoletoUser("nabin","ROLE_ADMIN");
           userService.addRoletoUser("nabin","ROLE_MANAGER");
        };
    }
}
