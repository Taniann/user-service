package ua.tania.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.tania.dto.UserDto;
import ua.tania.entity.User;
import ua.tania.exception.UpdateException;
import ua.tania.service.UserService;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Created by Tania Nebesna on 27.03.2019
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public void save(@Valid @RequestBody UserDto userDto) {
        userService.save(userDto);
    }

    @GetMapping("/{id}")
    public @ResponseBody User getOrderById(@PathVariable("id") long id) {
        User user = userService.findById(id);
        return user;
    }


/*    @PutMapping("/{id}")
    public void updateNameById(@PathVariable("id") long id, @RequestParam("name") String name) {
        User user = userService.findById(id);
        if (Objects.isNull(user)) {
            throw new UpdateException("Cannot update User by Id=" + id + ", because it doesn't present");
        } else {
            user.setName(name);
            userService.save(user);
        }
    }*/

    @DeleteMapping("/{id}")
    public void deleteOrderById(@PathVariable("id") long id) {
        userService.deleteById(id);
    }

}
