package ru.shepelev.crane.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.shepelev.crane.dtos.ProductDto;
import ru.shepelev.crane.models.Product;
import ru.shepelev.crane.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product create(ProductDto dto) {
        Product product = Product.builder()
                .productName(dto.getName())
                .price(dto.getPrice())
                .build();
        return productRepository.save(product);
    }

    public Product read(Integer id) throws NullPointerException {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElseGet(Product::new);
    }

    public Product read(String name) {
        return productRepository.findByProductName(name);
    }

    public List<Product> readAll() {
        return productRepository.findAll();
    }

    public Product update(Product product) {
        Optional<Product> optionalProduct = productRepository.findById(product.getId());
        if (optionalProduct.isPresent()) {
            Integer id = optionalProduct.get().getId();
        }
        return productRepository.save(product);
    }

    public void delete(Product product) {
        productRepository.delete(product);
    }
}
