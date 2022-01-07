package com.org.sunn.user.controller;

import com.org.sunn.user.entity.User;
import com.org.sunn.user.service.UserService;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long userId){
        log.info("Get User Details inside UserController");
        return userService.getUserById(userId);

    }
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Save User Details inside UserController");
        return  userService.saveUser(user);

    }
}
