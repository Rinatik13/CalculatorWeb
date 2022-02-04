package com.calculator.web.mvc;

import com.calculator.web.mvc.function.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping ("/")
    public String showView (){
        return "myView";
    }


    @RequestMapping ("/result")
    public String showPlus(@RequestParam("MyFunct") String funct, Model model) {

        long x = Long.parseLong(model.addAttribute("numberOne", funct).toString());
        long y = Long.parseLong(model.addAttribute("numberTwo",funct).toString());



        MyFunction plus = new Plus();
        long result = plus.functionStart(x,y);

        model.addAttribute("result",result);

        return "result";
    }

//    @RequestMapping("/result/minus")
//    public String showMinus(HttpServletRequest request, Model model) {
//
//        String num1 = request.getParameter("numberOne");
//        String num2 = request.getParameter("numberTwo");
//
//        long x = Long.parseLong(num1);
//        long y = Long.parseLong(num2);
//
//        MyFunction plus = new Minus();
//        long result = plus.functionStart(x,y);
//
//        model.addAttribute("result",result);
//
//        return "result";
//    }
//
//    @RequestMapping("/result/delenie")
//    public String showDelenie(HttpServletRequest request, Model model) {
//
//        String num1 = request.getParameter("numberOne");
//        String num2 = request.getParameter("numberTwo");
//
//        long x = Long.parseLong(num1);
//        long y = Long.parseLong(num2);
//
//        MyFunction plus = new Delenie();
//        long result = plus.functionStart(x,y);
//
//        model.addAttribute("result",result);
//
//        return "result";
//    }
//
//    @RequestMapping("/result/umnojenie")
//    public String showUmnojenie(HttpServletRequest request, Model model) {
//
//        String num1 = request.getParameter("numberOne");
//        String num2 = request.getParameter("numberTwo");
//
//        long x = Long.parseLong(num1);
//        long y = Long.parseLong(num2);
//
//        MyFunction plus = new Multiplication();
//        long result = plus.functionStart(x,y);
//
//        model.addAttribute("result",result);
//
//        return "result";
//    }

}
