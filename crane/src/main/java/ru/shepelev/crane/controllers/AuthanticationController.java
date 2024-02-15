package ru.shepelev.crane.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.shepelev.crane.dtos.AuthenticationResponse;
import ru.shepelev.crane.dtos.RegisterRequest;
import ru.shepelev.crane.dtos.UsernamePasswordToken;
import ru.shepelev.crane.services.UserService;

import java.io.IOException;

@RestController
@AllArgsConstructor
public class AuthanticationController {

    private final UserService userService;

    @PostMapping("/auth")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody UsernamePasswordToken token) {
        return new ResponseEntity<>(userService.login(token), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest token) {
        return new ResponseEntity<>(userService.register(token), HttpStatus.CREATED);
    }

    @PostMapping("/refresh-token")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.refreshToken(request, response);
    }

}
