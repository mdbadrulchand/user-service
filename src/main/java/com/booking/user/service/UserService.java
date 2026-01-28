package com.booking.user.service;

import com.booking.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User registerUser(User user);

    List<User> findAllUsers();

    User findUserById(Long id);
}
