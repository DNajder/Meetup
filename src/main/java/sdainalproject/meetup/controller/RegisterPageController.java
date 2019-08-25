package sdainalproject.meetup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sdainalproject.meetup.dto.UserRegisterDto;

import javax.validation.Valid;

@Controller
public class RegisterPageController {

    @GetMapping({"/register", "register", "register.html", "/register.html",})
    public String showUserRegisterForm(Model model) {
        UserRegisterDto userRegisterDto = new UserRegisterDto();
        model.addAttribute("userRegisterDto", userRegisterDto);
        return "registration";
    }


    @PostMapping({"/register", "register", "register.html", "/register.html",})
    public String handelUserRegisterForm(@ModelAttribute @Valid UserRegisterDto userRegisterDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()){
//            model.addAttribute("userRegisterDto",userRegisterDto);
            return "registration";
        }
        return "welcome";
    }
}
