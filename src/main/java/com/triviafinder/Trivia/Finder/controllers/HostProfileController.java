package com.triviafinder.Trivia.Finder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HostProfileController {
    @RequestMapping(value="/hostprofile", method = RequestMethod.GET)
    public String hostprofile() {
        return "hostprofile";
    }
}
