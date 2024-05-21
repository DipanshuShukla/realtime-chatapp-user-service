package com.dipanshushukla.realtimechatappuserservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class User {

    @Id
    private Long userId;
    
    @Column(nullable = false)
    private String username;
    
    @Column(nullable = false)
    private String email;

    private String fullName;
    private String avatar;
    private String bio;
}
