package com.latinojoel.health.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.latinojoel.health.model.User;
import com.latinojoel.health.model.UserProfile;


@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  private UserService userService;

  @Transactional
  public UserDetails loadUserByUsername(String email)
      throws UsernameNotFoundException {
   final User user = userService.findByEmail(email);
    System.out.println("User : " + user);
    if (user == null) {
      System.out.println("User not found");
      throw new UsernameNotFoundException("Username not found");
    }
    return new org.springframework.security.core.userdetails.User(user.getId() + "",
        user.getPassword(),
        user.getState().equals("Active"), true, true, true, getGrantedAuthorities(user));
  }


  private List<GrantedAuthority> getGrantedAuthorities(User user) {
    final List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

    for (UserProfile userProfile : user.getUserProfiles()) {
      System.out.println("UserProfile : " + userProfile);
      authorities.add(new SimpleGrantedAuthority("ROLE_" + userProfile.getType()));
    }
    System.out.print("authorities :" + authorities);
    return authorities;
  }

}
