package com.banking.bank_app.Controller;

import com.banking.bank_app.Helpers.GenAcctNumber;
import com.banking.bank_app.Model.User;
import com.banking.bank_app.Repository.AccountRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/account")
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @PostMapping("/create_account")
    public String createAccount(@RequestParam("account_name") String account_name,
                                @RequestParam("account_type") String account_type,
                                RedirectAttributes redirectAttributes,
                                HttpSession session) {

        //TODO: CHECK FOR EMPTY STRINGS
        if (account_name.isEmpty() || account_type.isEmpty()){
            redirectAttributes.addFlashAttribute("error", "Catalog name or type cannot be empty");
            return "redirect:/app/dashboard";
        }

        //TODO: GET LOGGED IN USER
        User user = (User) session.getAttribute("user");

        //TODO: GENERATE ACCOUNT/CATALOG NUMBER
        int setCatalogNumber = GenAcctNumber.generateAcctNumber();
        String catalogAccountNumber = Integer.toString(setCatalogNumber);

        //TODO: CREATE CATALOG ACCOUNT
        accountRepository.createCatalogAccount(user.getUser_id(),catalogAccountNumber, account_name,account_type );

        //SET SUCCESS MESSAGE
        redirectAttributes.addFlashAttribute("success", "Catalog created successfully");
        return "redirect:/app/dashboard";
    }
}
