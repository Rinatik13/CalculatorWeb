package com.calculator.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.tools.java.Parser;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping ("/")
    public String showView (){
        return "myView";
    }
    @RequestMapping ("/result")
    public String showResult(HttpServletRequest request, Model model) {

        String num1 = request.getParameter("numberOne");
        String num2 = request.getParameter("numberTwo");

        long x = Long.parseLong(num1);
        long y = Long.parseLong(num2);


        return "result";
    }

}
