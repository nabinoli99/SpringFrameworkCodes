package in.nabin.service;

import in.nabin.entities.User;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // ✅ CORRECT: Checks if logged-in user matches returned user
    @PostAuthorize("returnObject.username == authentication.name")
    public User getUserProfile(String username) {
        if ("nabin".equals(username)) {
            return new User(2L, "nabin", "ROLE_USER");
        } else if ("nabkiran".equals(username)) {
            return new User(1L, "nabkiran", "ROLE_ADMIN");
        }
        return null;
    }

    // ✅ FIXED: Now checks if YOU are admin, not the returned user
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public User getUserById(Long id) {
        if (id == 1L) {
            return new User(1L, "nabkiran", "ROLE_ADMIN");
        } else {
            return new User(2L, "nabin", "ROLE_USER");
        }
    }

    // ✅ CORRECT: Combination check
    @PostAuthorize("hasRole('ROLE_ADMIN') or returnObject.username == authentication.name")
    public User getAnyUserProfile(String username) {
        if ("nabin".equals(username)) {
            return new User(2L, "nabin", "ROLE_USER");
        } else if ("nabkiran".equals(username)) {
            return new User(1L, "nabkiran", "ROLE_ADMIN");
        }
        return new User(3L, "guest", "ROLE_GUEST");
    }
}