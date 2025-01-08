package spring_security.example.spring_security.domain.product;

public record ProductResponseDTO(String id, String name, Integer price) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getName(), product.getPrice());
    }
}
