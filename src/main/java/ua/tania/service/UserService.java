package ua.tania.service;


import ua.tania.dto.UserDto;
import ua.tania.entity.User;

import java.util.List;

/**
 * Created by Tania Nebesna on 27.03.2019
 */
public interface UserService {
    void save(UserDto userDto);

    User findById(Long id);

    List<User> findAll();

    void update(User user);

    void deleteById(Long id);

}
