package com.banking.bank_app.Controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.banking.bank_app.Model.Account;
import com.banking.bank_app.Model.User;
import com.banking.bank_app.Repository.AccountRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AccountRepository accountRepo;
    
    @GetMapping("/dashboard")
    public ModelAndView getDashboard(HttpSession session){
        ModelAndView getDashboardPage = new ModelAndView("dashboard");

        //Get Logged in user details
        User user = (User) session.getAttribute("user");


        //Get the Accounts of the logged in user
        List<Account> getUserAccount = accountRepo.getUserAccountById(user.getUser_id());


        //Get the balance
        BigDecimal totalBalance = accountRepo.getBalance(user.getUser_id());

        //Set Object
        getDashboardPage.addObject("user",user);
        getDashboardPage.addObject("userAccounts", getUserAccount);
        getDashboardPage.addObject("totalBalance", totalBalance);
        return getDashboardPage;

    }
}
