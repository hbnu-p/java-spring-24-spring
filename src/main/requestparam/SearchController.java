package requestparam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @RequestMapping("/search")
    public String search(@RequestParam("query") String query) {
        // 处理搜索查询参数
        return "searchResultsView";
    }
}
