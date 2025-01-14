package spring_security.example.spring_security.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
