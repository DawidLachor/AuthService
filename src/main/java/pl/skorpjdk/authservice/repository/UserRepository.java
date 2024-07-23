package pl.skorpjdk.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.skorpjdk.authservice.model.User;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
