package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.enzanInputForm;

@Controller
@RequestMapping("/enzan")
public class ReceiveController {

    @RequestMapping("")
    public String index(){
        return "enzanForm";
    }

    @RequestMapping(value= "/result", method = RequestMethod.POST)
    public String enzanInputForm(enzanInputForm form, Model model){
    double num1 = Double.parseDouble(form.getNum1());
    double num2 = Double.parseDouble(form.getNum2());
    String operator = form.getOperator();
    double result = 0;

    //swich文で計算ロジックを書く
    switch(operator){
        case "add" :
            result = num1 + num2;
            break;
        case "subtract":
            result = num1 - num2;
            break;
        case "multiplication" :
            result = num1 * num2;
            break;
        case "divide" :
            result = num1 / num2;
            break;

    }
    
    
    model.addAttribute("num1", num1);
    model.addAttribute("num2",num2);
    model.addAttribute("operator", operator);
    model.addAttribute("result", result);
    
        return "finished";
    }
}
