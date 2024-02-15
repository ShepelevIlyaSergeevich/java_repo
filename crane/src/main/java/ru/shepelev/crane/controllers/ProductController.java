package ru.shepelev.crane.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.shepelev.crane.dtos.ProductDto;
import ru.shepelev.crane.models.Product;
import ru.shepelev.crane.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Product> create(@RequestBody ProductDto dto) {
        return new ResponseEntity<>(productService.create(dto), HttpStatus.OK);
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Product> read(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(productService.read(id), HttpStatus.OK);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Product>> readAll() {
        return new ResponseEntity<>(productService.readAll(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> update(@RequestBody Product product) {
        return new ResponseEntity<>(productService.update(product), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id) {
        productService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
