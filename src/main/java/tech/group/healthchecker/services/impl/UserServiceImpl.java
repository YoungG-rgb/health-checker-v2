package tech.group.healthchecker.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.group.healthchecker.entities.User;
import tech.group.healthchecker.repositories.UserRepository;
import tech.group.healthchecker.services.UserService;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateById(User user, Long userId) {
        user.setId(userId);
        return userRepository.save(user);
    }

    @Override
    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public Optional<User> getById(Long userId) {
        return userRepository.findById(userId);
    }
}
