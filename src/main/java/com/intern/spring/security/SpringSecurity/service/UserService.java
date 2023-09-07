package com.intern.spring.security.SpringSecurity.service;

import com.intern.spring.security.SpringSecurity.model.ApplicationUser;
import com.intern.spring.security.SpringSecurity.model.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("In the userService");
        if(!username.equals("Theara"))throw new UsernameNotFoundException("failed");
        Set<Role> role = new HashSet<>();
        role.add(new Role(1,"USER"));
        return new ApplicationUser(1,"Theara", passwordEncoder.encode("password"),role );
    }
}
