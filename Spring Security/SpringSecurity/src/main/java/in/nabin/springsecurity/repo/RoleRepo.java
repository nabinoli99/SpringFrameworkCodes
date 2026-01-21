package in.nabin.springsecurity.repo;

import in.nabin.springsecurity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long>
{
    Role findByName(String name);
}
