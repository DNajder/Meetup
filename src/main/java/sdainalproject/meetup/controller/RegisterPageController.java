package sdainalproject.meetup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterPageController {

    @GetMapping({"/registration", "registration", "registration.html", "/registration.html",})
    public String loginPage() {
        return "registration";
    }
}
