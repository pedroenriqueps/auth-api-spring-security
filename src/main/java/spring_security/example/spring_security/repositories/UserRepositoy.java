package spring_security.example.spring_security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepositoy extends JpaRepository<User, String> {
        UserDetails findByLogin(String login);
}
