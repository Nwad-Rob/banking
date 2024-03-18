package com.banking.bank_app.MailMessenger;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.banking.bank_app.Config.MailConfig;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

public class MailMessenger {
    @SuppressWarnings("null")
    public static void htmlEmailMessenger(String from, String toMail, String subject, String body) throws MessagingException{
        // Get mail config
        JavaMailSender sender = MailConfig.getMailConfig();

        //Set Mime Message
        MimeMessage message = sender.createMimeMessage();

        //Set Mime Message Helper
        MimeMessageHelper htmlMessage = new MimeMessageHelper(message,true);

        //Set Mail Attributes/ Properties
        htmlMessage.setTo(toMail);
        htmlMessage.setFrom(from);
        htmlMessage.setSubject(subject);
        htmlMessage.setText(body, true);

        //Send Message
        sender.send(message);

    }   
}
