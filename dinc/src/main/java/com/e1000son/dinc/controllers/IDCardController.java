package com.e1000son.dinc.controllers;

import com.e1000son.dinc.integration.IDNICRestClient;
import com.e1000son.dinc.integration.IRestClientDNRN;
import com.e1000son.dinc.integration.dto.BirthCertificate;
import com.e1000son.dinc.integration.dto.CertificateFromDNRN;
import com.e1000son.dinc.util.PDFGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IDCardController {
    @Autowired
    IDNICRestClient dnicRestClient;
    @Autowired
    IRestClientDNRN restClientDNRN;
    @Autowired
    PDFGenerator pdfGenerator;

    @RequestMapping("/showFindCitizen")
    public String showFindCitizen(){return "/citizen/findCitizen";}

    @RequestMapping("/showPageFindCitizenDNRN")
    public String showPageFindCitizenDNRN(){return "/dnrn/findCitizen";}

    @RequestMapping("/findCitizen")
    public String showCitizenDetails(@RequestParam("nuic") String nuic, ModelMap modelMap){
        BirthCertificate birthCertificate = dnicRestClient.findCitizen(nuic);
        modelMap.addAttribute("certificate",birthCertificate);
        return "citizen/citizenDetails";
    }

    @RequestMapping("/findCitizenDNRN")
    public String showCitizenDetailsFromDnrn(@RequestParam("nuic") String nuic, ModelMap modelMap){
        CertificateFromDNRN certificateFromDNRN = restClientDNRN.findCitizenDNRN(nuic);
        modelMap.addAttribute("certificate",certificateFromDNRN);
        return "dnrn/citizenDetails";
    }
    @RequestMapping("/generateIdCard")
    public String generateIdCard(@RequestParam("certificateId") Long certificateId,
                                 @RequestParam("placeEmission") String placeEmission,
                                 @RequestParam("maritalStatus") String maritalStatus,
                                 ModelMap modelMap){

        BirthCertificate birthCertificate = dnicRestClient.findCitizenById(certificateId);

        pdfGenerator.generatePDF(birthCertificate,
                "/Users/e1000son/Desktop/bilhetes/bi" + birthCertificate.getId() + ".pdf");
        modelMap.addAttribute("msg",
                "BI do cidadão " + birthCertificate.getCitizen().getFirstName() + " " +
                        birthCertificate.getCitizen().getLastName() +
                        " gerado com sucesso.");

        return "/citizen/idConfirmation";
    }
}
