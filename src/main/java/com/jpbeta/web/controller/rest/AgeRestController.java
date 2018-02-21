package com.jpbeta.web.controller.rest;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpbeta.web.form.AgeForm;
import com.jpbeta.web.service.AgeService;

@RestController
@RequestMapping("/ajax/age")
public class AgeRestController {
  @Autowired
  private AgeService ageService;

  @RequestMapping(value = "/getList", method = RequestMethod.GET)
  public String searchBusinessRenrakuListAjax(Model model, AgeForm form) throws ParseException {

    return ageService.getList(form);
  }
}
