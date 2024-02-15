package ru.shepelev.crane.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.shepelev.crane.models.Product;
import ru.shepelev.crane.services.ProductService;

@RestController
@AllArgsConstructor
public class UserController {

    private final ProductService productService;

    @GetMapping("/buy/{name}")
    public Product buyProduct(@PathVariable String productName, @RequestParam int amount) {
        return productService.read(productName);
    }

    /*@GetMapping("/putInBatch/{name}")
    public Product putProductInBatch(@PathVariable String productName, @RequestParam int amount) {
        return productService.read(productName);
    }*/
}
