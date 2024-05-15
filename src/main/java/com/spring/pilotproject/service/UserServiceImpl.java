package com.spring.pilotproject.service;

import com.spring.pilotproject.entity.User;
import com.spring.pilotproject.model.dto.UserDTO;
import com.spring.pilotproject.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "Trần Lê Quốc Anh", "winwinwin1601@gmail.com", "0123456789", "avata1.img", "123"));
        users.add(new User(2, "Trần Lê Quốc Anh1", "winwinwin1602@gmail.com", "0123456788", "avata2.img", "123"));
        users.add(new User(3, "Trần Lê Quốc Anh3", "winwinwin1603@gmail.com", "0123456787", "avata3.img", "123"));
    }

    @Override
    public List<UserDTO> getListUser() {
        List<UserDTO> result = new ArrayList<UserDTO>();
        for (User user : users){
            result.add(UserMapper.toUserDTO(user));
        }
        return result;
    }
}
