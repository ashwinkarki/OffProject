package com.ashwin.officeproject.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashwin.officeproject.model.Office;
import com.ashwin.officeproject.repository.OfficeRepsitory;
 
@Controller
public class MainController {
 
	@Autowired
    OfficeRepsitory officeRepository;
 
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String index(Model model) {
      
      return "login";
    }
    
    @RequestMapping(value = { "/office"}, method = RequestMethod.GET)
    public String office(Model model) {
       model.addAttribute("offices", new Office()); 
      return "office";
    }
    
    @RequestMapping(value = "/addOffice", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("offices") Office office, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "office";
        }
        officeRepository.save(office);
        model.addAttribute("offices", new Office()); 
        return "office";
    }
 
    /*@RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) {
       model.addAttribute("persons", persons);
       return "personList";
    }*/
 
}