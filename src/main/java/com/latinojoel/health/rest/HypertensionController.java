package com.latinojoel.health.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.latinojoel.health.model.HypertensionRecord;
import com.latinojoel.health.service.HypertensionService;
import com.latinojoel.health.service.UserService;

@RestController
@RequestMapping("/api")
public class HypertensionController {

  @Autowired
  HypertensionService hypertensionService;

  @Autowired
  UserService userService;

  @RequestMapping(value = "/hypertensions", method = RequestMethod.GET,
      headers = "Accept=application/json")
  public List<HypertensionRecord> getHypertensioByUserSession() {
    final Integer id =
        Integer.parseInt(SecurityContextHolder.getContext().getAuthentication().getName());
    final List<HypertensionRecord> hypertensionRecords =
        hypertensionService.getHypertensionsByUserId(userService.findById(id));
    return hypertensionRecords;
  }

}
