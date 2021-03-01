package ru.coffee.nostresso.controller.admin;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.coffee.nostresso.model.entity.User;
import ru.coffee.nostresso.service.user.IUserService;

import java.util.UUID;

@RestController
@RequestMapping("/admin/user")
@AllArgsConstructor
public class AdminUserController {

    private final IUserService userService;

    @GetMapping("/")
    public Iterable<User> getUsers() {
        return userService.findAll();
    }

    @PostMapping("/")
    public UUID addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/")
    public String updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return "user updated";
    }

    @DeleteMapping("/")
    public String deleteUser(@RequestParam UUID userId) {
        userService.deleteById(userId);
        return "user " + userId + " deleted";
    }
}

