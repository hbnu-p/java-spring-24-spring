package modelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    @ModelAttribute("user")
    public User populateUser() {
        return new User();
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "formView";
    }
}
