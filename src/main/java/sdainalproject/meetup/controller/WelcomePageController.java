package sdainalproject.meetup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomePageController {
    @GetMapping({"/welcomePage", "welcomePage", "welcomePage.html", "/welcomePage.html"})
    public String loginPage() {
        return "welcome";
    }
}
