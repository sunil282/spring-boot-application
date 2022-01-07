package com.org.sunn.user.controller;

import com.org.sunn.user.entity.User;
import com.org.sunn.user.service.UserService;
import com.sun.media.jfxmedia.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long userId){
        return userService.getUserById(userId);

    }
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return  userService.saveUser(user);

    }
}
