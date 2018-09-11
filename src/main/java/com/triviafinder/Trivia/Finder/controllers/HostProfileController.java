package com.triviafinder.Trivia.Finder.controllers;

import com.triviafinder.Trivia.Finder.DataAccessObjects.HostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HostProfileController {

    @Autowired
    private HostDao hostdao;


    @RequestMapping(value="/hostprofile", method = RequestMethod.GET)
    public String hostprofile(Model model, @RequestParam int id) {
        model.addAttribute( "name", hostdao.findOne(id).getName());
        model.addAttribute("addressLineOne", hostdao.findOne(id).getAddressLineOne());
        model.addAttribute("addressLineTwo", hostdao.findOne(id).getAddressLineTwo());
        model.addAttribute("phone", hostdao.findOne(id).getPhone());
        model.addAttribute("website", hostdao.findOne(id).getWebsite());
        model.addAttribute("menu", hostdao.findOne(id).getMenu());
        model.addAttribute("description", hostdao.findOne(id).getDescription());
        model.addAttribute("trivia", hostdao.findOne(id).getTrivia());
        return "hostprofile";
    }
}
