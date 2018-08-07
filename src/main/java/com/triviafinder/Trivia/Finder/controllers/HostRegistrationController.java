package com.triviafinder.Trivia.Finder.controllers;

import com.triviafinder.Trivia.Finder.Objects.HostDtoObject;
import com.triviafinder.Trivia.Finder.Objects.UserDtoObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HostRegistrationController {
    @RequestMapping(value="/host/host_registration", method = RequestMethod.GET)
    public String showRegistrationForm(WebRequest request, Model model, @ModelAttribute("host") HostDtoObject accountDto,
                                       BindingResult result, Errors errors) {
        HostDtoObject hostDto = new HostDtoObject();
        model.addAttribute("host", hostDto);
        return "/host/host_registration";
    }

    @RequestMapping(value = "/host/host_registration", method = RequestMethod.POST)
    public String showRegistrationFormPOST() {
        return "/registration-welcome";
    }
}
