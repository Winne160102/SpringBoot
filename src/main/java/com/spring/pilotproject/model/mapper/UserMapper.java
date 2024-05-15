package com.spring.pilotproject.model.mapper;

import com.spring.pilotproject.entity.User;
import com.spring.pilotproject.model.dto.UserDTO;

public class UserMapper {
    public static UserDTO toUserDTO(User user){
        UserDTO tmp = new UserDTO();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setEmail(user.getEmail());
        tmp.setAvatar(user.getAvatar());
        tmp.setPhone(user.getPhone());
        return tmp;
    }
}
