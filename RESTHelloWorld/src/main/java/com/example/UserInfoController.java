package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/friends")
public class UserInfoController {

    @RequestMapping("/list")
    public String friendList(
            @RequestParam(name = "count",required = false,defaultValue = "50") String count,ModelMap model) {
        model.addAttribute("name", count);
        return "friendlist";
    }
}
