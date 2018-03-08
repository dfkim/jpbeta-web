package com.jpbeta.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jpbeta.web.form.CustomerForm;

@Controller
@RequestMapping("/customer")
public class CustomerController {
  /**
   * 初期表示
   *
   * @param model
   * @param customerForm
   * @return
   */
  @RequestMapping("/entry")
  public String entry(Model model, @ModelAttribute CustomerForm customerForm) {
    return "customer/entry";
  }

  /**
   * 確認画面
   *
   * @param model
   * @param customerForm
   * @return
   */
  @RequestMapping(value = "/", params = "entryConf", method = { RequestMethod.POST })
  public String entryConf(Model model, @ModelAttribute CustomerForm customerForm) {
    model.addAttribute("customerForm", customerForm);
    return "customer/entryConf";
  }

  /**
   * 戻る
   *
   * @param model
   * @param customerForm
   * @return
   */
  @RequestMapping(value = "/", params = "backToEntry", method = { RequestMethod.POST })
  public String backToEntry(Model model, @ModelAttribute CustomerForm customerForm) {
    model.addAttribute("customerForm", customerForm);
    return "customer/entry";
  }

}
