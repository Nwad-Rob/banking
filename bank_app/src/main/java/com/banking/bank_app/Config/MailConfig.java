package com.banking.bank_app.Config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {
    
    @Bean
    public static JavaMailSenderImpl getMailConfig(){
        JavaMailSenderImpl emailConfig = new JavaMailSenderImpl();

        // Set Properties
        Properties props = emailConfig.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug ", "smtp");

        //Setting mail credentials, using STMP Server
        emailConfig.setHost("stmp.gmail.com");
        emailConfig.setPort(465);
        emailConfig.setUsername("t0239282@gmail.com");
        emailConfig.setPassword("tokb hilw bvla skjs");

        return emailConfig;

    }
}
