package com.latinojoel.health.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.latinojoel.health.model.User;
import com.latinojoel.health.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/users", method = RequestMethod.GET,
      headers = "Accept=application/json")
  public List<User> getUsers() {
    List<User> listOfUsers = new ArrayList<User>();
    listOfUsers = userService.getUsers();
    return listOfUsers;
  }

  @RequestMapping(value = "/user/{id}", method = RequestMethod.GET,
      headers = "Accept=application/json")
  public User getUser(@PathVariable String id) {
    return userService.findById(Integer.parseInt(id));
  }

  @RequestMapping(value = "/user", method = RequestMethod.GET, params = {"email"},
      headers = "Accept=application/json")
  public User getUserByEmail(@RequestParam String email) {
    return userService.findByEmail(email);
  }

}
