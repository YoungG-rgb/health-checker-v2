package tech.group.healthchecker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.group.healthchecker.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
