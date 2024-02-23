package com.banking.bank_app.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.banking.bank_app.Model.User;

import jakarta.validation.Valid;

@RestController
public class IndexController {

    @GetMapping("/")
    public ModelAndView getIndex() {
        // viewName are the names of the jsp files
        ModelAndView getIndexPage = new ModelAndView("index");
        getIndexPage.addObject("PageTitle", "Home");
        System.out.println("In Index Page Controller:");
        return getIndexPage;
    }

    @GetMapping("/login")
    public ModelAndView getLogin() {
        ModelAndView getLoginPage = new ModelAndView("login");
        System.out.println("In Login Page Controller");
        getLoginPage.addObject("PageTitle", "login");
        return getLoginPage;
    }

    @GetMapping("/register")
    public ModelAndView getRegister() {
        ModelAndView getRegisterPage = new ModelAndView("register");
        System.out.println("In Register Page Controller");
        getRegisterPage.addObject("PageTitle", "Register");
        return getRegisterPage;
    }

    @GetMapping("/error")
    public ModelAndView getError() {
        ModelAndView getErrorPage = new ModelAndView("error");
        System.out.println(" In Error Page Controller:");
        getErrorPage.addObject("PageTitle", "Error");
        return getErrorPage;
    }

    @GetMapping("/verify")
    public ModelAndView getVerify() {
        ModelAndView getVerifyPage = new ModelAndView("login");
        System.out.println(" In Verify Page Controller:");
        getVerifyPage.addObject("PageTitle", "error");
        return getVerifyPage;
    }

    @PostMapping("/register")
    public ModelAndView postRegister(@Valid @ModelAttribute("registerUser") User user,
            BindingResult result, @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("confirm_password") String confirm_password) {

        ModelAndView postRegisterPage = new ModelAndView("register");

        // Check for Errors
        if (result.hasErrors() && confirm_password.isEmpty()) {
            postRegisterPage.addObject("confirm_pass", "The confirm field is required");
            return postRegisterPage;
        }

        return postRegisterPage;
    }

}
