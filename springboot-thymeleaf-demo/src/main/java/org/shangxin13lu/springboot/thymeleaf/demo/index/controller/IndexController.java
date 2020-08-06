package org.shangxin13lu.springboot.thymeleaf.demo.index.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @GetMapping(value = "")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
