package com.dipanshushukla.realtimechatappuserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipanshushukla.realtimechatappuserservice.entity.User;
import java.util.Optional;
import java.util.List;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username);
}