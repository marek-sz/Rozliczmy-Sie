package com.hsn.rozliczmysie.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public void create(UserDTO userDTO) {
        userRepository.save(userMapper.toEntity(userDTO));
    }
}
