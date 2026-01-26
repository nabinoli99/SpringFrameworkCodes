package in.nabin.springsecurity.repo;

import in.nabin.springsecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Long>
{
    User findByUsername(String username);
}
