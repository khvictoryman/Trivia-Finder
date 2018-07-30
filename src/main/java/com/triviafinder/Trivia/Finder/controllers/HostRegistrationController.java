package com.triviafinder.Trivia.Finder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HostRegistrationController {
    @RequestMapping(value="HostRegistration")
    public String HostRegistration() {
        return "Host Registration";
    }
}
