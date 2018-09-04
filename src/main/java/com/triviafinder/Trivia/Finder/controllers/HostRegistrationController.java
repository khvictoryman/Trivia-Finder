package com.triviafinder.Trivia.Finder.controllers;

import com.triviafinder.Trivia.Finder.DataAccessObjects.HostDao;
import com.triviafinder.Trivia.Finder.DataAccessObjects.HostRankDao;
import com.triviafinder.Trivia.Finder.models.host.HostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;
import java.util.Random;

@Controller
public class HostRegistrationController {

    @Autowired
    private HostDao hostDao;


    @RequestMapping(value="/host/host_registration", method = RequestMethod.GET)
    public String showRegistrationForm(WebRequest request, Model model, @ModelAttribute("host") HostModel accountDto,
                                       BindingResult result, Errors errors) {
        HostModel hostDto = new HostModel();
        model.addAttribute("host", hostDto);
        return "/host/host_registration";
    }

    @RequestMapping(value = "/host/host_registration", method = RequestMethod.POST)
    public String showRegistrationFormPOST(@ModelAttribute("host") @Valid HostModel newHost, Errors errors, Model model) {
        Random rand = new Random();
        int  n = rand.nextInt(5) + 1;
        newHost.setHostRank(n);
        if (errors.hasErrors()) {

            return "/host/host_registration";
        }
        hostDao.save(newHost);
        return "/registration-welcome";
    }
}
