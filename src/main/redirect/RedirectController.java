package redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

    @RequestMapping("/redirectToHome")
    public String redirectToHome() {
        return "redirect:/home";
    }
}
