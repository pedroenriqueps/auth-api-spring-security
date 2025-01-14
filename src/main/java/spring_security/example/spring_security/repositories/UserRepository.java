package spring_security.example.spring_security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_security.example.spring_security.domain.user.User;
import org.springframework.security.core.userdetails.UserDetails;



public interface UserRepository extends JpaRepository<User, String> {
        UserDetails findByLogin(String login);
}
