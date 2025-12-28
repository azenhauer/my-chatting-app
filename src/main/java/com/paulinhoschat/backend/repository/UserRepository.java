package com.paulinhoschat.backend.repository;

import com.paulinhoschat.backend.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository< User,Long> {
}
