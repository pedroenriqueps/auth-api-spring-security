package spring_security.example.spring_security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_security.example.spring_security.domain.product.Product;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
