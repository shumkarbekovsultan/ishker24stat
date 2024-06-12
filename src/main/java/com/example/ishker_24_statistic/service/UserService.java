//package com.example.ishker_24_statistic.service;
//
//import com.example.ishker_24_statistic.models.Permission;
//import com.example.ishker_24_statistic.models.User;
//import com.example.ishker_24_statistic.repository.PermissionRepository;
//import com.example.ishker_24_statistic.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import java.util.List;
//
//@Service
//public class UserService implements UserDetailsService{
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PermissionRepository permissionRepository;
//
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public User getUserById(Integer id) {
//        return userRepository.findById(id).orElse(null);
//    }
//
//    public User saveUser(User user) {
//        return userRepository.save(user);
//    }
//
//    public void deleteUser(Integer id) {
//        userRepository.deleteById(id);
//    }
//
//    public User addPermissionToUser(Integer userId, Integer permissionId) {
//        User user = userRepository.findById(userId).orElse(null);
//        Permission permission = permissionRepository.findById(permissionId).orElse(null);
//        if (user != null && permission != null) {
//            user.getPermissions().add(permission);
//            return userRepository.save(user);
//        }
//        return null;
//    }
//
//    public User removePermissionFromUser(Integer userId, Integer permissionId) {
//        User user = userRepository.findById(userId).orElse(null);
//        Permission permission = permissionRepository.findById(permissionId).orElse(null);
//        if (user != null && permission != null) {
//            user.getPermissions().remove(permission);
//            return userRepository.save(user);
//        }
//        return null;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findbyUsername(username).orElseThrow(() -> new UsernameNotFoundException(
//                String.format("User'%s' not found", username)));
//        return null;
//    }
//}