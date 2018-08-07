package com.triviafinder.Trivia.Finder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationWelcomeController {
    @RequestMapping(value = "/registration-welcome", method = RequestMethod.GET)
    public String RegistrationWelcomeViewGET() {
        return "/registration-welcome";
    }

    @RequestMapping(value = "/registration-welcome", method = RequestMethod.POST)
    public String RegistrationWelcomeViewPOST() {
        return "/registration-welcome";
    }
}
