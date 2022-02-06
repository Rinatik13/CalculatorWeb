package com.calculator.web.mvc;

import com.calculator.web.mvc.function.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;


@Controller
public class MyController {
    @RequestMapping ("/")
    public String showView (){
        return "myView";
    }

// view result получает данные на основании ниже приведённых вычислений
// пользователь заполняет значения двух переменных и выбирает необходимую функцию
// после нажатия кнопки submit мы проверяем какую функцию выбрал пользователь
// на основании выбраной функции производим следующие расчёты
// !!! не реализована зашита от 0 в делении !!!

    @RequestMapping ("/result")
    public String showPlus(HttpServletRequest request, Model model) {
        long x = Long.parseLong(request.getParameter("numberOne"));
        long y = Long.parseLong(request.getParameter("numberTwo"));
        String text = request.getParameter("1").toString();
        long result = 0;

        if (text.equals("1")){
            MyFunction plus = new Plus();
            result = plus.functionStart(x,y);

        }
        else if(text.equals("2")){
            MyFunction minus = new Minus();
            result = minus.functionStart(x,y);
        }
        else if (text.equals("3")){
            MyFunction delenie = new Delenie();
            result = delenie.functionStart(x,y);
        }
        else if (text.equals("4")){
            MyFunction multiplication = new Multiplication();
            result = multiplication.functionStart(x,y);
        }


        model.addAttribute("result",result);
        return "result";
    }


}
