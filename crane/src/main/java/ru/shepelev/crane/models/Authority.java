package ru.shepelev.crane.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Authority {

    @Id
    private Long id;

    private String authority;

    @ManyToMany(mappedBy = "authorities")
    private List<User> user;
}
