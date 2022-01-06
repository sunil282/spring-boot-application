package com.org.sunn.user.service;

import com.org.sunn.user.entity.User;
import com.org.sunn.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long userId) {
        return userRepository.getUserByUserId(userId);
    }

    public User saveUser(User user) {

        return userRepository.save(user);
    }
}
