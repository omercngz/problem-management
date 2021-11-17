package com.example.problemmanagement.service.imp;

import com.example.problemmanagement.entity.User;
import com.example.problemmanagement.repository.UserRepository;
import com.example.problemmanagement.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public User save(User user) {
        if(user.getEmail()==null)
            throw new IllegalArgumentException("User EMail Cannot Be Empty!");
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }


    @Override
    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
