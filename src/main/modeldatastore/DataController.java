package modeldatastore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {

    @RequestMapping("/showData")
    public String showData(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "dataView";
    }
}
