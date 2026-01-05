package com.paulinhoschat.backend.repository;

import com.paulinhoschat.backend.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageModel,Long> {


}
