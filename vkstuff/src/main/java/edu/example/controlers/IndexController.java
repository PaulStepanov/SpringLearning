package edu.example.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/",method = RequestMethod.GET)
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        return "index";
    }
}
