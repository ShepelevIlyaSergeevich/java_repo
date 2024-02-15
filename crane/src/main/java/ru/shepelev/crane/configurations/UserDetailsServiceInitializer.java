package ru.shepelev.crane.configurations;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.shepelev.crane.repositories.UserRepository;
import ru.shepelev.crane.services.UserDetailsServiceWrapper;

@Configuration
@RequiredArgsConstructor
public class UserDetailsServiceInitializer {

    private final UserRepository userRepository;

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceWrapper(userRepository);
    }
}
