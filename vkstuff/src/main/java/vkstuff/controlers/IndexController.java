package vkstuff.controlers;

import vkstuff.logic.SubscritionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class IndexController {
    @Autowired
    public SubscritionManager subscritionAPIManager;

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        return "index";
    }
}
