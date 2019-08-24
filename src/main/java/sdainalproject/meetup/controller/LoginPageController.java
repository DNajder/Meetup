package sdainalproject.meetup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPageController {
    @GetMapping({"/login", "login", "login.html", "/login.html",})
    public String loginPage() {
        return "login";
    }
}
