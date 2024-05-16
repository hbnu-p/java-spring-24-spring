package pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user/{id}")
    public String getUser(@PathVariable("id") String userId) {
        // 使用用户ID进行处理
        return "userDetailView";
    }
}
