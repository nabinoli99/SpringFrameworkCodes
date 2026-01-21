package in.nabin.springsecurity.repo;

import in.nabin.springsecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>
{
    User findByUsername(String username);
}
