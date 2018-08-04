package com.triviafinder.Trivia.Finder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HostRegistrationController {
    @RequestMapping(value="/host/host_registration", method = RequestMethod.GET)
    public String HostRegistration() {
        return "/host/host_registration";
    }
}
