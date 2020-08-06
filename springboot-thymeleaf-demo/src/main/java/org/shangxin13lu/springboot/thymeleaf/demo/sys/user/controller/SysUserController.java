package org.shangxin13lu.springboot.thymeleaf.demo.sys.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
@RequestMapping(value = "/sys/sysuser")
public class SysUserController {

    @GetMapping(value = "/user")
    public ModelAndView user() {
        return new ModelAndView("/sys/user/user");
    }
}
