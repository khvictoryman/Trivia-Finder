package com.triviafinder.Trivia.Finder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ForumController {
    @RequestMapping(value="/forum", method = RequestMethod.GET)
    public String ForumView() {
        return "/forum";
    }
}
