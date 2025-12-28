package com.paulinhoschat.backend.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageDTO {
    private String message;
    private Long id;
    private Long senderId;
    private String senderName;
    private Long receiverId;
    private String receiverName;
    private LocalDateTime date;

}
