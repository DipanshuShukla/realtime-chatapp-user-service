package com.dipanshushukla.realtimechatappuserservice.dto;

import com.dipanshushukla.realtimechatappuserservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long userId;
    
    private String username;
    
    private String email;

    private String fullName;
    private String avatar;
    private String bio;

    public static UserDTO fromEntity(User user){
        return new UserDTO(user.getUserId(), user.getUsername(), user.getEmail(), user.getFullName(), user.getAvatar(), user.getBio());
    }
}
