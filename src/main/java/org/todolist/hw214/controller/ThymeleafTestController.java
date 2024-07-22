package org.todolist.hw214.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafTestController {

    @GetMapping("/test2")
    public String testThymeleaf(Model model){
        return "test";
    }

}