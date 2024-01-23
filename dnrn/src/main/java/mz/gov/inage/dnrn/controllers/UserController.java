package mz.gov.inage.dnrn.controllers;

import mz.gov.inage.dnrn.entities.User;
import mz.gov.inage.dnrn.repos.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        ModelMap modelMap){
        //Lançar e tratar excepção
        User user = userRepository.findByEmail(email);

        if (user.getPassword().equals(password))
            return "/citizen/registerCitizen";
        else
            modelMap.addAttribute("msg",
                    "Nome do utilizador ou Password inválidos. " +
                            "Por favor, tente novamente.");
        return showLoginPage();
    }
}
