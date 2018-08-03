package com.triviafinder.Trivia.Finder.controllers;

import com.triviafinder.Trivia.Finder.Objects.UserDtoObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

///import javax.validation.Valid;

@Controller
public class UserRegistrationController {
    @RequestMapping(value = "/user/user_registration", method = RequestMethod.GET)
    public String showRegistrationForm(WebRequest request, Model model, @ModelAttribute("user") UserDtoObject accountDto,
                                       BindingResult result, Errors errors) {
        UserDtoObject userDto = new UserDtoObject();
        model.addAttribute("user", userDto);
        return "user/user_registration";
    }



}