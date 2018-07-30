package com.triviafinder.Trivia.Finder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserRegistrationController {
    @RequestMapping(value="UserRegistration")
    public String UserRegistration() {
        return "User Registration";
    }
}
