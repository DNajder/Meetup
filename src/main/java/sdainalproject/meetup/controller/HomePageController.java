package sdainalproject.meetup.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomePageController {
    public String homePage() {
        return "index";
    }
}
