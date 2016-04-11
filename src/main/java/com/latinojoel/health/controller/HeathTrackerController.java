package com.latinojoel.health.controller;

import java.util.HashSet;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.latinojoel.health.model.HypertensionRecord;
import com.latinojoel.health.model.MomentType;
import com.latinojoel.health.model.User;
import com.latinojoel.health.model.UserProfile;
import com.latinojoel.health.model.UserProfileType;
import com.latinojoel.health.service.HypertensionService;
import com.latinojoel.health.service.UserProfileService;
import com.latinojoel.health.service.UserService;

@Controller
public class HeathTrackerController {

  @Autowired
  UserProfileService userProfileService;

  @Autowired
  UserService userService;


  @Autowired
  HypertensionService hypertensionService;


  // Spring Security see this :
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView login(@RequestParam(value = "error", required = false) String error,
      @RequestParam(value = "logout", required = false) String logout) {

    final ModelAndView model = new ModelAndView();
    if (error != null) {
      model.addObject("error", "Invalid username and password!");
    }

    if (logout != null) {
      model.addObject("msg", "You've been logged out successfully.");
    }
    model.setViewName("login");

    return model;

  }

  @RequestMapping(value = "/admin**", method = RequestMethod.GET)
  public ModelAndView adminPage() {

    final ModelAndView model = new ModelAndView();
    model.addObject("title", "Spring Security Hello World");
    model.addObject("message", "This is protected page!");
    model.setViewName("admin");

    return model;

  }

  @RequestMapping("/logout")
  public String showLoggedout() {
    return "logout";
  }

  @RequestMapping(value = "/newUser", method = RequestMethod.GET)
  public String newRegistration(ModelMap model) {
    final User user = new User();
    model.addAttribute("user", user);
    return "newUser";
  }

  @RequestMapping(value = "/recoveryAccess", method = RequestMethod.GET)
  public String recoveryAccess(ModelMap model) {
    return "recoveryAccess";
  }

  @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
  public String accessDenied(ModelMap model) {
    return "accessDenied";
  }

  @RequestMapping(value = "/app/home", method = RequestMethod.GET)
  public String home(ModelMap model) {
    final User user = userService.findById(
        Integer.parseInt(SecurityContextHolder.getContext().getAuthentication().getName()));
    model.addAttribute("user", user);
    return "home";
  }

  @RequestMapping(value = "/app/registerHypertension", method = RequestMethod.GET)
  public ModelAndView registerHypertension(ModelMap modelmap) {
    final User user = userService.findById(
        Integer.parseInt(SecurityContextHolder.getContext().getAuthentication().getName()));
    final ModelAndView model = new ModelAndView();
    model.addObject("hypertensionForm", new HypertensionRecord());
    model.addObject("momentTypeList", MomentType.getValues());
    model.addObject("user", user);
    model.setViewName("registerHypertension");
    return model;
  }


  @RequestMapping(value = "/app/listHypertension", method = RequestMethod.GET)
  public ModelAndView listHypertension(ModelMap modelmap) {
    final User user = userService.findById(
        Integer.parseInt(SecurityContextHolder.getContext().getAuthentication().getName()));
    final ModelAndView model = new ModelAndView();
    model.addObject("hypertensions", hypertensionService.getHypertensionsByUserId(user));
    model.addObject("user", user);
    model.setViewName("listHypertension");
    return model;
  }

  @RequestMapping(value = "/app/registerHypertension", method = RequestMethod.POST)
  public ModelAndView addHypertensionRecord(
      @ModelAttribute("hypertensionForm") HypertensionRecord hypertensionRecord,
      BindingResult result, ModelMap modelmap) {

    final User user = userService.findById(
        Integer.parseInt(SecurityContextHolder.getContext().getAuthentication().getName()));
    if (result.hasErrors()) {
      System.out.println("There are errors");
      final ModelAndView model = new ModelAndView();
      model.addObject("hypertensionForm", new HypertensionRecord());
      model.addObject("momentTypeList", MomentType.getValues());
      model.addObject("user", user);
      model.setViewName("registerHypertension");
      return model;
    }
    hypertensionRecord.setUser(user);
    hypertensionService.save(hypertensionRecord);

    final ModelAndView model = new ModelAndView();
    model.addObject("hypertensions", hypertensionService.getHypertensionsByUserId(user));
    model.setViewName("listHypertension");
    model.addObject("user", user);
    modelmap.addAttribute("success", "Hypertension record has been registered successfully");
    return model;
  }

  /*
   * This method will be called on form submission, handling POST request It also validates the user
   * input
   */
  @RequestMapping(value = "/newUser", method = RequestMethod.POST)
  public String saveRegistration(@Valid User user, BindingResult result, ModelMap model) {

    if (result.hasErrors()) {
      System.out.println("There are errors");
      return "newUser";
    }

    final HashSet<UserProfile> profiles = new HashSet<UserProfile>();
    final UserProfile userProfile = new UserProfile();
    userProfile.setType(UserProfileType.USER.getUserProfileType());
    profiles.add(userProfile);
    user.setUserProfiles(profiles);

    userService.save(user);

    System.out.println("First Name : " + user.getFirstName());
    System.out.println("Last Name : " + user.getLastName());
    System.out.println("Password : " + user.getPassword());
    System.out.println("Email : " + user.getEmail());
    System.out.println("Checking UsrProfiles....");
    if (user.getUserProfiles() != null) {
      for (UserProfile profile : user.getUserProfiles()) {
        System.out.println("Profile : " + profile.getType());
      }
    }

    model.addAttribute("success",
        "User " + user.getFirstName() + " has been registered successfully");
    return "registrationsuccess";
  }
}
