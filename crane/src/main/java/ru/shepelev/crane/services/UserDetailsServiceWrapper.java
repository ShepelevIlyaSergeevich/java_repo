package ru.shepelev.crane.services;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.shepelev.crane.models.UserDetailsWrapper;
import ru.shepelev.crane.repositories.UserRepository;

@AllArgsConstructor
public class UserDetailsServiceWrapper implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new UserDetailsWrapper(userRepository.findByUsername(username));
    }
}
