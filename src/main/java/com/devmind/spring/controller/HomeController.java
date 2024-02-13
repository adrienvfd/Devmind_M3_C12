package com.devmind.spring.controller;

import com.devmind.spring.model.User;
import com.devmind.spring.service.TimeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class HomeController {
    TimeService timeService = new TimeService();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        System.out.println("Home Page Requested, locale = " + locale);
        model.addAttribute("serverTime", timeService.getTimeAndDate(locale));

        return "home";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String user(@Validated User user, Model model) {
        System.out.println("User Page Requested");
        model.addAttribute("serverTime", timeService.getTimeAndDate(new Locale("ro")));
        model.addAttribute("userName", user.getName());
        model.addAttribute("userEmail", user.getEmail());
        model.addAttribute("userPhone", user.getPhone());
        model.addAttribute("userBirthDate", user.getBirthDate());
        return "user";
    }
}