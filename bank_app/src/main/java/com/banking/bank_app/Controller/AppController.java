package com.banking.bank_app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.banking.bank_app.Model.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/app")
public class AppController {
    
    @GetMapping("/dashboard")
    public ModelAndView getDashboard(HttpSession session){
        ModelAndView getDashboardPage = new ModelAndView("dashboard");
        User user = (User) session.getAttribute("user");
        return getDashboardPage;

    }
}
