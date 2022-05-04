package azat.curs.curs.controllers;

import azat.curs.curs.models.User;
import azat.curs.curs.repository.UserRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String viewLoginPage(){

        return "login";
    }
    @GetMapping("/register")
    public String showSingUpForm(@NotNull Model model){
        model.addAttribute("user", new User());

        return "signup-form";
    }

    @PostMapping("/process-register")
    public String processRegistration(User user){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        userRepository.save(user);

        return "register-success";
    }
    @GetMapping("/users")
    public String viewUserList(Model model){
        List<User> usersList = userRepository.findAll();
        model.addAttribute("usersList", usersList);

        return "users";
    }

}
