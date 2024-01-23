package mz.gov.inage.dnrn.controllers;

import mz.gov.inage.dnrn.entities.User;
import mz.gov.inage.dnrn.repos.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private IUserRepository userRepository;
    @RequestMapping("/showReg")
    public String showRegistrationPage(){return "/auth/registerUser";}

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user){
        userRepository.save(user);
        return showLoginPage();
    }

    @RequestMapping("/showLogin")
    public String showLoginPage(){return "/auth/login";}
}
