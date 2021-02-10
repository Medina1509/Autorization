package M.Kalmyk.aop6Kalmyk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebControl {
    @GetMapping("/")
    public String home() {
        return "index";
    }
}