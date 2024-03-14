package com.springmvc.web.repository;

import com.springmvc.web.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);


}
