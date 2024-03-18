package com.banking.bank_app.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = {"bank_app"} )
//Source code https : https://github.com/JaysonMnguni/DemoBankin-App-With-SpringBoot.git
public class AppConfig extends WebMvcConfigurationSupport {
    // Application configuration setup

    //In order for our application to find resources
    @SuppressWarnings("null")
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("css/**","images/**","js/**")
        .addResourceLocations("classpath:/static/css","classpath:/static/js","classpath:/static/images");
    }

     @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver jspViewResolver = new InternalResourceViewResolver();
        jspViewResolver.setPrefix("/WEB-INF/jsp/");
        jspViewResolver.setSuffix(".jsp");
        jspViewResolver.setViewClass(JstlView.class);
        return jspViewResolver;
    }
    
    //If you want to use thymeleaf instead of JSTL and remember to install thymeleaf pom.xml file
    //@Bean
    // public SpringResourceTemplateResolver templateResolver(){
    //     SpringResourceTemplateResolver jspViewResolver = new SpringResourceTemplateResolver();
    //     jspViewResolver.setPrefix("/WEB-INF/jsp/");
    //     jspViewResolver.setSuffix(".jsp");
    //     jspViewResolver.setTemplateMode(TemplateMode.HTML);

    //     return jspViewResolver;
    // }

    // @Bean
    // public SpringTemplateEngine templateEngine() {
    //     SpringTemplateEngine templateEngine = new SpringTemplateEngine();
    //     templateEngine.setTemplateResolver(templateResolver());
    //     return templateEngine;
    // }

    // @Bean
    // public ViewResolver thymeleafViewResolver() {
    //     ThymeleafViewResolver resolver = new ThymeleafViewResolver();
    //     resolver.setTemplateEngine(templateEngine());
    //     return resolver;
    // }

    


}
