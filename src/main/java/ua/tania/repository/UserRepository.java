package ua.tania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.tania.entity.User;

/**
 * Created by Tania Nebesna on 27.03.2019
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
