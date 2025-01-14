package spring_security.example.spring_security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import spring_security.example.spring_security.repositories.UserRepository;

@Service
public class AuthorizationService implements UserDetailsService {

        @Autowired
        UserRepository repository;
        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return repository.findByLogin(username);
        }
}