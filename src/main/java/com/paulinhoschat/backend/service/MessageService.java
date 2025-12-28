package com.paulinhoschat.backend.service;

import com.paulinhoschat.backend.dto.MessageDTO;
import com.paulinhoschat.backend.model.MessageModel;
import com.paulinhoschat.backend.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    private MessageDTO toDTO(MessageModel m){
        MessageDTO dto = new MessageDTO();
        dto.setId(m.getId());
        dto.setMessage(m.getMessage());
        dto.setSenderId(m.getSender().getId());
        dto.setReceiverId(m.getReceiver().getId());
        return dto;
    }

}
