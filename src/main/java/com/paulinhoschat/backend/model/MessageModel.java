package com.paulinhoschat.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "message_info" )
@Getter
@Setter
@NoArgsConstructor
public class MessageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    private LocalDateTime sentTime;

    private boolean wasSent;

    private boolean wasRead;

    private boolean wasDeleted;

    private LocalDateTime readAt;

    private LocalDateTime deletedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    private User sender;

    @ManyToOne(fetch = FetchType.LAZY)
    private User receiver;

    @PrePersist
    public void onCreate() {
        this.sentTime = LocalDateTime.now();
    }


}

