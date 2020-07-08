package com.lachacra.service;

import com.lachacra.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);

}
