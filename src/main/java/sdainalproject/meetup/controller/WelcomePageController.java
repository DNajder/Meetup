package sdainalproject.meetup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomePageController {
    @GetMapping({"/welcom", "welcom", "welcom.html", "/welcom.html"})
    public String loginPage() {
        return "welcom";
    }
}
