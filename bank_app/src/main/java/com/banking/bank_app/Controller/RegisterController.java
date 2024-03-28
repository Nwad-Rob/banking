package com.banking.bank_app.Controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.banking.bank_app.Helpers.HTML;
import com.banking.bank_app.Helpers.Token;
import com.banking.bank_app.MailMessenger.MailMessenger;
import com.banking.bank_app.Model.User;
import com.banking.bank_app.Repository.UserRepository;

import jakarta.mail.MessagingException;
import jakarta.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/error")
    public ModelAndView getError() {
        ModelAndView getErrorPage = new ModelAndView("error");
        System.out.println(" In Error Page Controller:");
        getErrorPage.addObject("PageTitle", "error");
        return getErrorPage;
    }

    @PostMapping("/register")
    public ModelAndView postRegister(@Valid @ModelAttribute("registerUser") User user,
            BindingResult result, @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("confirm_password") String confirm_password) {

        ModelAndView postRegisterPage = new ModelAndView("register");

 // CHECK FOR ERRORS
        if (result.hasErrors() && confirm_password.isEmpty()) {
            postRegisterPage.addObject("confirm_pass", "The confirm field is required");
            return postRegisterPage;
        }

// CHECK FOR PASSWORD MATCH
     if (!password.equals(confirm_password)){
        postRegisterPage.addObject("passwordMismatch","password does not match");
        return postRegisterPage;
     }

// GET STRING TOKEN
    String token = Token.generateToken();

// GENERATE RANDOM CODE
    Random rand = new Random();
    int bound = 123;
    int code = bound * rand.nextInt(bound);

// GET EMAIL HTML BODY
     String emailBody = HTML.htmlEmailTemplate(token, code);

// HASH THE PASSWORD
     String hashed_password = BCrypt.hashpw(password,BCrypt.gensalt());                      

// REGISTER USER
     userRepo.registerUser(first_name, last_name, email, hashed_password, token, code);   

// SEND EMAIL NOTIFICATION
     try {
        MailMessenger.htmlEmailMessenger("no-reply@Dynamicbank.com", email, "Verify Account", emailBody);
    } catch (MessagingException e) {
        e.printStackTrace();     
    }

// RETURN TO REGISTER PAGE
    String successMessage = "Account Registered Successfully. Please check your email and verify your account";
    postRegisterPage.addObject("success", successMessage);
    return postRegisterPage;
    
    }
}
