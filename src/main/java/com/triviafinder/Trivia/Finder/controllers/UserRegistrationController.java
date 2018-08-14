package com.triviafinder.Trivia.Finder.controllers;

import com.triviafinder.Trivia.Finder.DataAccessObjects.UserDao;
import com.triviafinder.Trivia.Finder.Object_Models.UserModel;
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

///import javax.validation.Valid;

@Controller
public class UserRegistrationController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user/user_registration", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        //UserModel userDto = new UserModel();
        model.addAttribute(new UserModel());
        return "user/user_registration";
    }

    @RequestMapping(value = "/user/user_registration", method = RequestMethod.POST)
    public String ValidateUserRegistration(@ModelAttribute  @Valid UserModel newUser,
                                           Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "/user/user_registration";
        }

        userDao.save(newUser);
        return "/registration-welcome";
    }


}