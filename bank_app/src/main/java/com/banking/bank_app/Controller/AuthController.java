package com.banking.bank_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.banking.bank_app.Helpers.Token;
import com.banking.bank_app.Model.User;
import com.banking.bank_app.Repository.UserRepository;

import jakarta.servlet.http.HttpSession;


@Controller
public class AuthController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/login")
    public ModelAndView getLogin() {
        System.out.println("In Login Page Controller");
        ModelAndView getLoginPage = new ModelAndView("login");

        //Set a token String
        String token = Token.generateToken();

        //Send Token to view
        getLoginPage.addObject("token", token);
        getLoginPage.addObject("PageTitle", "login");
        return getLoginPage;
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email, 
                        @RequestParam("password") String password, 
                        @RequestParam("_token") String token,
                        Model model,
                        HttpSession session){
        
        //VALIDATE INPUT FIELDS OR FORM DATA
        if ( email == null || email.isEmpty()||  password == null || password.isEmpty() ){
            model.addAttribute("error", "Username or Password Cannot Be Empty");
            return "login";
        }

        //CHECK IF EMAIL EXISTS
        String getEmailFromDb = userRepo.getUserEmail(email);
        if(getEmailFromDb != null){
            //GET PASSWORD IN DATABASE
            String getPasswordFromDb = userRepo.getUserPassword(getEmailFromDb);
            
            //VALIDATE PASSWORD
            if(!BCrypt.checkpw(password, getPasswordFromDb)){
                model.addAttribute("error", "Incorrect Username or Password");
                 return "login";
            }

        }else{
            model.addAttribute("error", "Email Does Not Exist, Please Register Account");
            return "login";
        }

        //CHECK IF USER ACCOUNT IS VERIFIED
        boolean verfied = userRepo.isVerified(getEmailFromDb);
        if (!verfied){
            String verification = "This Account Is Not Yet Verified, Please Check Email And Verify Account";
            model.addAttribute("error", verification);
             return "login";
        }

        //PROCEED TO LOG THE USER'
        User user = userRepo.getUserDetails(getEmailFromDb);

        //SET SESSION ATTRIBUTE
        session.setAttribute("user", user);
        session.setAttribute("token", token);
        session.setAttribute("authenticated", true);
       
        

        return "redirect:/app/dashboard";
    }   

    @GetMapping("/logout")
    public String logout(HttpSession session, RedirectAttributes redirect){
        session.invalidate();
        redirect.addFlashAttribute("logged_out", "Logged out successful");
        return "redirect:/login";

    }
}
