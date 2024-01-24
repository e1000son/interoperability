package com.e1000son.dinc.controllers;

import com.e1000son.dinc.integration.IDNICRestClient;
import com.e1000son.dinc.integration.dto.BirthCertificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IDCardController {
    @Autowired
    IDNICRestClient dnicRestClient;
    @RequestMapping("/showFindCitizen")
    public String showFindCitizen(){return "/citizen/findCitizen";}

    @RequestMapping("/findCitizen")
    public String showCitizenDetails(@RequestParam("nuic") String nuic, ModelMap modelMap){
        BirthCertificate birthCertificate = dnicRestClient.findCitizen(nuic);
        modelMap.addAttribute("certificate",birthCertificate);
        return "citizen/citizenDetails";
    }
}
