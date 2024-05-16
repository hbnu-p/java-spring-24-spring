package requestheader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {

    @RequestMapping("/displayHeader")
    public String displayHeader(@RequestHeader("User-Agent") String userAgent) {
        // 处理请求头
        return "headerView";
    }
}
