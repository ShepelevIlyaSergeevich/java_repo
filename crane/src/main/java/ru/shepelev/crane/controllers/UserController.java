package ru.shepelev.crane.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.shepelev.crane.models.Product;
import ru.shepelev.crane.services.ProductService;
import ru.shepelev.crane.services.UserService;

import java.math.BigDecimal;

@RestController
@AllArgsConstructor
public class UserController {

    private final ProductService productService;
    private final UserService userService;

    @GetMapping("/buy/{name}")
    public Product buyProduct(@PathVariable String productName, @RequestParam int amount) {
        return productService.read(productName);
    }

    @GetMapping("/putInBatch/{name}")
    public Product putProductInBatch(@PathVariable String productName, @RequestParam int amount) {
        return productService.read(productName);
    }
}
