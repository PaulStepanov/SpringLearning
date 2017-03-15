package vkstuff.controlers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import vkstuff.logic.SubscritionManager;
import vkstuff.logic.UserIDValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/subscriptions", method = RequestMethod.GET)
public class SubscriptionsController {
    @Autowired
    public SubscritionManager subscritionManager;

    @Autowired
    public UserIDValidator userIDValidator;

    @RequestMapping("/get")
    public String index(@RequestParam(name = "id") String id,
                        @RequestParam(name = "count", required = false, defaultValue = "20") Integer count,
                        ModelMap modelMap) {
        id = userIDValidator.validateID(id);
        if (id != null) {
            modelMap.put("subscriptions", subscritionManager.getSubscritionsByID(id, count));
            return "comunities";
        } else {
            return "error";
        }
    }
}
