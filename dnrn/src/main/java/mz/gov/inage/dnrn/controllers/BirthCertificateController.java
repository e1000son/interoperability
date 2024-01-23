package mz.gov.inage.dnrn.controllers;

import mz.gov.inage.dnrn.dto.BirthCertificateRequest;
import mz.gov.inage.dnrn.entities.BirthCertificate;
import mz.gov.inage.dnrn.services.BirthCertificateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BirthCertificateController {
    @Autowired
    BirthCertificateServiceImpl birthCertificateService;
    @RequestMapping(value = "registerCitizen", method = RequestMethod.POST)
    public String saveBirthCertificate(BirthCertificateRequest request, ModelMap modelMap){

        BirthCertificate birthCertificate = birthCertificateService.saveCertificate(request);

        modelMap.addAttribute("msg",
                "Certificado (ID = " + birthCertificate.getId() + ")" +
                        " do cidadão " + birthCertificate.getCitizen().getFirstName() + " " +
                        birthCertificate.getCitizen().getLastName() + " (NUIC = " +
                        birthCertificate.getNuic() +
                        ") criado com sucesso.");

        return "/citizen/certificateConfirmation";
    }
}
