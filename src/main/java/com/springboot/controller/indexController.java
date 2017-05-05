package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhu on 2017/5/5.
 */
@Controller
@RequestMapping("/springboot")
public class indexController {

    @RequestMapping("/index")
    public String index(){

        return "success";
    }

}
