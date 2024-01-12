package ru.shepelev.crane.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Password {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "password")
    private String password;

    @Column(name = "salt")
    private String salt;

    @OneToOne(mappedBy = "password")
    private User owner;
}
