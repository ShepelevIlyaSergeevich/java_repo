package ru.shepelev.crane.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shepelev.crane.services.UserService;

@RestController
@AllArgsConstructor
public class AuthanticationController {

    private final UserService userService;

    @PostMapping("/login")
    public void login(String username, String password) {
    }

    @PostMapping("/register")
    public void register(String username, String password) {
    }

}
