package com.banking.bank_app.Controller_advisor;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.banking.bank_app.Model.User;

@ControllerAdvice
public class AdvisorController {

    @ModelAttribute("registerUser")
    public User getuserDefaults(){
       return new User(); 
    }

}
