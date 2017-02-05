package controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestContr {

    @RequestMapping("/test")
    public String test(ModelMap modelMap) {
        return "testview.jsp";
    }
}
