package com.xmonster.howtaxing.repository.user;

import com.xmonster.howtaxing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserId(String userId);

    Optional<User> findByUserEmail(String userEmail);
}
