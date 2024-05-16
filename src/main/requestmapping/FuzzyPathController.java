package requestmapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FuzzyPathController {

    // 使用问号（?）
    @RequestMapping("/product?")
    public String product() {
        return "productView";
    }

    // 使用星号（*）
    @RequestMapping("/order/*")
    public String order() {
        return "orderView";
    }

    // 使用正则表达式
    @RequestMapping("/user/{userId:[0-9]+}")
    public String user(@PathVariable("userId") String userId) {
        return "userView";
    }
}
