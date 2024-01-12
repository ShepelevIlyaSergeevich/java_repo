package ru.shepelev.crane.models;

import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class GrantedAuthorityWrapper implements GrantedAuthority {

    private Authority authority;

    @Override
    public String getAuthority() {
        return authority.getAuthority();
    }
}
