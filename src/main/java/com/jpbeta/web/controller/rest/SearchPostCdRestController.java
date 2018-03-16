package com.jpbeta.web.controller.rest;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpbeta.web.form.SearchPostCdForm;
import com.jpbeta.web.service.SearchPostCdService;

@RestController
@RequestMapping("/ajax/searchPostCd")
public class SearchPostCdRestController {
  @Autowired
  private SearchPostCdService serchPostCdService;

  /**
   * 郵便番号検索
   *
   * @param model
   * @param form
   * @return
   * @throws ParseException
   */
  @RequestMapping(value = "/doSearchAjax", method = RequestMethod.POST)
  public String doSearchAjax(Model model, SearchPostCdForm form) throws ParseException {

    return serchPostCdService.doSearchAjax(form);
  }
}
