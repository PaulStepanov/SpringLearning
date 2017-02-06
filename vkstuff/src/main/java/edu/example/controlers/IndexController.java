package edu.example.controlers;

import edu.example.logic.SubscritionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/",method = RequestMethod.GET)
public class IndexController {
    @Autowired
    public SubscritionManager subscritionManager;
    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.put("subscriptions",subscritionManager.getSubscritionsByID("83973489",20));
        return "index";
    }
}
