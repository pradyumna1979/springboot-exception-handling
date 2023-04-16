package com.exception.service;

import com.exception.dto.UserRequest;
import com.exception.entity.User;
import com.exception.exception.UserNotFoundException;
import com.exception.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(UserRequest userRequest) {
        User user = new User();
        user.setAge(userRequest.getAge());
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setGender(userRequest.getGender());
        user.setMobile(userRequest.getMobile());
        user.setNationality(userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int userId) throws UserNotFoundException {
        User user = userRepository.findAllByUserId(userId);
        if(user == null)
            throw new UserNotFoundException("User Not found id: "+userId);
            return user;
    }
}
