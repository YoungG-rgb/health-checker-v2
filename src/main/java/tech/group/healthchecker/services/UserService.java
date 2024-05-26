package tech.group.healthchecker.services;

import tech.group.healthchecker.entities.User;

import java.util.Optional;

public interface UserService {

    User save(User user);

    User updateById(User user, Long userId);

    void delete(Long userId);

    Optional<User> getById(Long userId);

}
