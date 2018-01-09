package com.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by YS on 2018/1/9.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping(value = "test")
    public String test(Model model){
        model.addAttribute("a",1);
        return "test";
    }

}
