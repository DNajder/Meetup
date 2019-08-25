package sdainalproject.meetup.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sdainalproject.meetup.dao.UserModel;
import sdainalproject.meetup.dto.UserRegisterDto;
import sdainalproject.meetup.repository.UserRepository;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class RegisterPageController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

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

        UserModel userModel= new UserModel();
        userModel.setName(userRegisterDto.getName());
        userModel.setEmail(userRegisterDto.getEmail());
        userModel.setPasswordHash(passwordEncoder.encode(userRegisterDto.getPassword()));
        return "redirect:/welcomePage";
    }
}
