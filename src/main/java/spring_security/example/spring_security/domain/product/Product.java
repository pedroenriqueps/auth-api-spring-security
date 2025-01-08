package spring_security.example.spring_security.domain.product;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Table(name = "product")
@Entity(name = "product")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private Integer price;

    public Product(ProductRequestDTO data) {
        this.price = data.price();
        this.name = data.name();
    }

}
