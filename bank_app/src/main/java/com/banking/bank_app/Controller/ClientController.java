package com.banking.bank_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.banking.bank_app.Repository.ClientRepository;

@RestController
public class ClientController {
    @Autowired
    ClientRepository clientRepo;

    //Get Client details
    //Create Client
    //Recieve Client
    //Update Client
    //Delete Client
    //Search by Clientid, first name, last name  or email

}
