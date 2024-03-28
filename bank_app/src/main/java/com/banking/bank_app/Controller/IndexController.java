package com.banking.bank_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.banking.bank_app.Repository.UserRepository;

@Controller
public class IndexController {

    @Autowired
    private UserRepository userRepo;

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


    @GetMapping("/verify")
    public ModelAndView getVerify(@RequestParam("token")String token, @RequestParam ("code") int code) {
        ModelAndView getVerifyPage = new ModelAndView("login");
        userRepo.verifyAccount(token, code);

        System.out.println(" In Verify Page Controller:");
        getVerifyPage.addObject("success", "Account has been verified successfully, Please proceed to Log in");
        return getVerifyPage;
    }

    

}
