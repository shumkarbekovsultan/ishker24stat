//package com.example.ishker_24_statistic;
//
//import com.example.ishker_24_statistic.models.User;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//
//@Data
//@AllArgsConstructor
//
//    public class UserDetailsImpl implements UserDetails {
//        private long id;
//        private String username;
//        private String pass;
//
//    public UserDetailsImpl build(User user) {
//            return new UserDetailsImpl(
//                    user.getId(),
//                    user.getUsername(),
//                    user.getPass());
//        }
//
//
//
//        @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of();
//    }
//
//    @Override
//    public String getPassword() {
//        return pass;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNotExpired(){
//        return  true;
//    }
//
//    @Override
//    public boolean isAccountNotLocked(){
//        return  true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired(){
//        return  true;
//    }
//
//}
