package chinese;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChineseController {

    @RequestMapping(value = "/greet", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String greet() {
        return "你好，世界！";
    }
}
