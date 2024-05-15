package com.spring.pilotproject.service;

import com.spring.pilotproject.model.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDTO> getListUser();
}
