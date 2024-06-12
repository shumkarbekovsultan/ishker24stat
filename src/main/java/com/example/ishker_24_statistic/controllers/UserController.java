//package com.example.ishker_24_statistic.controllers;
//
//import com.example.ishker_24_statistic.models.User;
//import com.example.ishker_24_statistic.service.UserService;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Integer id) {
//        return userService.getUserById(id);
//    }
//
//    @PostMapping
//    public User saveUser(@RequestBody User user) {
//        return userService.saveUser(user);
//    }
//
//    @PutMapping("/{id}")
//    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
//        User existingUser = userService.getUserById(id);
//        if (existingUser != null) {
//            user.setId(id);
//            return userService.saveUser(user);
//        } else {
//            return null;
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable Integer id) {
//        userService.deleteUser(id);
//    }
//
//    @PostMapping("/{userId}/permissions/{permissionId}")
//    public User addPermissionToUser(@PathVariable Integer userId, @PathVariable Integer permissionId) {
//        return userService.addPermissionToUser(userId, permissionId);
//    }
//
//    @DeleteMapping("/{userId}/permissions/{permissionId}")
//    public User removePermissionFromUser(@PathVariable Integer userId, @PathVariable Integer permissionId) {
//        return userService.removePermissionFromUser(userId, permissionId);
//    }
//}