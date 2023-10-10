package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.Entity.User;
import org.example.dto.RegisterDto;
import org.example.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User register(RegisterDto registerDto) {
        User user = new User();
        user.setName(registerDto.getName());
        user.setPassword(registerDto.getPassword());
        user.setUsername(registerDto.getUsername());
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findUser(int id) {
        return userRepository.findById(id).orElseThrow(()-> {
            return new IllegalArgumentException("User ID를 찾을 수 없습니다.");
        });
    }
}
//Dto로 데이터를 받고,
//
//Dto의 데이터를 Entity에 저장하고
//
//Repository에게 넘겨주는 것을 확인하실 수 있습니다.
