package com.triviafinder.Trivia.Finder.controllers;

import com.triviafinder.Trivia.Finder.DataAccessObjects.HostDao;
import com.triviafinder.Trivia.Finder.DataAccessObjects.HostRankDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ForumController {

    @Autowired
    private HostDao hostDao;
    @Autowired
    private HostRankDao hostRankDao;

    @RequestMapping(value="/forum", method = RequestMethod.GET)
    public String ForumView(Model model) {
        model.addAttribute("hosts", hostDao.findAll());
        return "/forum";
    }
}