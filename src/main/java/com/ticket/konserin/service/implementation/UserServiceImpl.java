package com.ticket.konserin.service.implementation;

import com.ticket.konserin.model.User;
import com.ticket.konserin.repository.UserRepository;
import com.ticket.konserin.service.UserService;
import com.ticket.konserin.utils.dto.user.UserRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User create(UserRequest request) {
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
        userRepository.save(user);
        return user;
    }

    @Override
    public User getByid(Integer id) {
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("not found"));
    }

    @Override
    public User udpdateById(Integer id, UserRequest request) {
        User user = getByid(id);
        if (request.getName() != null) {
            user.setName(request.getName());
        }
        if (request.getEmail() != null) {
            user.setName(request.getEmail());
        }
        if (request.getPassword() != null) {
            user.setName(request.getPassword());
        }
        userRepository.save(user);
        return user;
    }

    @Override
    public void deleteById(Integer id) {
        User user = getByid(id);
        userRepository.deleteById(id);
    }
}
