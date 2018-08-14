package siarhei.pashkou.SimpleStart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName4;
 
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName4);
        return "home";
    }
}
