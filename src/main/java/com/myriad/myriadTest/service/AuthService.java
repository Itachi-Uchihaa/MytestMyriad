package com.myriad.myriadTest.service;

import com.myriad.myriadTest.dto.UserDTO;
import com.myriad.myriadTest.model.User;
import com.myriad.myriadTest.repositorie.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public User register(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);

        return userRepository.save(user);
    }
}
