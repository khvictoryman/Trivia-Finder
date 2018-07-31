package com.triviafinder.Trivia.Finder.controllers;

import com.triviafinder.Trivia.Finder.Objects.UserDtoObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

@Controller
public class UserRegistrationController {
    @RequestMapping(value = "/user/user_registration", method = RequestMethod.GET)
    public String showRegistrationForm(WebRequest request, Model model) {
        UserDtoObject userDto = new UserDtoObject();
        model.addAttribute("user", userDto);
        return "user/user_registration";
    }

}