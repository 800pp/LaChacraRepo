package com.lachacra.service;

import com.lachacra.model.User;
import com.lachacra.repository.RoleRepository;
import com.lachacra.repository.UserRepository;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    //private final BCryptPasswordEncoder bCryptPasswordEncoder;

    //BCryptPasswordEncoder bCryptPasswordEncoder,
    public UserServiceImpl(UserRepository userRepository,  RoleRepository roleRepository) {
        this.userRepository = userRepository;
        //this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(User user) {
        //String passwordEncode = bCryptPasswordEncoder.encode(user.getPassword());
        //user.setPassword(passwordEncode);
        user.setRoles(new HashSet<>(roleRepository.findAll())); //TODO pending to review
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
