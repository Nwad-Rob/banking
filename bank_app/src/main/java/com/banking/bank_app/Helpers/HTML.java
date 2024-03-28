package com.banking.bank_app.Helpers;

public class HTML {

    public static String htmlEmailTemplate(String token, int code){
        
        //Verifying Account
        String url = "http://127.0.0.1:8070/verify?token=" + token + "&code=" + code;

        String htmlString = "<!DOCTYPE html>\n" +
        "<html lang='en'>\n" +
        "<head>\n" +
        "    <meta charset='UTF-8' />\n" +
        "    <meta name='viewport' content='width=device-width, initial-scale=1.0' />\n" +
        "    <link rel='stylesheet' href='../src/email.css' />\n" +
        "    <title>Email Document</title>\n" +
        "    <style>\n" +
        "        * {\n" +
        "            box-sizing: border-box;\n" +
        "            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS',\n" +
        "                sans-serif;\n" +
        "        }\n" +
        "\n" +
        "        body {\n" +
        "            height: 100vh;\n" +
        "            background-color: aliceblue;\n" +
        "            display: flex;\n" +
        "            align-items: center;\n" +
        "            justify-content: center;\n" +
        "        }\n" +
        "\n" +
        "        .wrapper {\n" +
        "            width: 550px;\n" +
        "            height: auto;\n" +
        "            padding: 15px;\n" +
        "            background-color: white;\n" +
        "            border-radius: 7px;\n" +
        "        }\n" +
        "\n" +
        "        .email-msg-header {\n" +
        "            text-align: center;\n" +
        "        }\n" +
        "\n" +
        "        .company-name {\n" +
        "            font-size: 35px;\n" +
        "            color: grey;\n" +
        "            width: 100%;\n" +
        "            text-align: center;\n" +
        "        }\n" +
        "\n" +
        "        .welcome-text {\n" +
        "            align-items: center;\n" +
        "            justify-content: center;\n" +
        "        }\n" +
        "\n" +
        "        .verify-account-btn {\n" +
        "            padding: 15px;\n" +
        "            background-color: aquamarine;\n" +
        "            text-decoration: none;\n" +
        "            color: black;\n" +
        "            border-radius: 5px;\n" +
        "        }\n" +
        "\n" +
        "        .copy-right {\n" +
        "            text-align: center;\n" +
        "            padding: 15px;\n" +
        "            color: gray;\n" +
        "            font-size: 14px;\n" +
        "            margin: 20px 0px;\n" +
        "            justify-content: flex;\n" +
        "        }\n" +
        "    </style>\n" +
        "</head>\n" +
        "<body>\n" +
        "<!--Wrapper-->\n" +
        "<div class='wrapper'>\n" +
        "<!--Email MSG Header-->\n" +
        "<h2 class='email-msg-header'>Welcome and Thank you for Choosing</h2>\n" +
        "<hr />\n" +
        "<!--End of MSG Header-->\n" +
        "<!--Company Name-->\n" +
        "<div class='company-name'>Dynamic Bank</div>\n" +
        "\n" +
        "<!--End of Company Name-->\n" +
        "\n" +
        "<p class='welcome-text'>\n" +
        "    Your Account has been successfully registered, Please click below to\n" +
        "    verify your account\n" +
        "</p>\n" +
        "<!--End of Wrapper-->\n" +
        "<br />\n" +
        "<br />\n" +
        "\n" +
        "<!-- Verification Button-->\n" +
        "<center>\n" +
        "    <a href='" + url + " ' class='verify-account-btn' role='button'> Verify Account</a>\n" +
        "</center>\n" +
        "<!-- End of Verification Button-->\n" +
        "\n" +
        "<!--Copyright Clause-->\n" +
        "<div class='copy-right'>&copy; Copy Rights 2022. All Rights Reserved</div>\n" +
        "<!--End of Copyright Clause-->\n" +
        "</div>\n" +
        "</body>\n" +
        "</html>";


        return htmlString;



    }
}
