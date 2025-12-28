package com.paulinhoschat.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, name = "username")
    private String username;
    @Column( nullable = false, name = "password_hash")
    private String passwordHash;
    @Column(unique = true, nullable = false, name = "email")
    private String email;
    
    private LocalDateTime createdAt;
    private LocalDateTime lastLoggedIn;
    private LocalDateTime lastLoggedOut;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sender")
    private List<MessageModel> messagesSent;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "receiver")
    private List<MessageModel> messagesReceived;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDateTime.now();
    }

}
