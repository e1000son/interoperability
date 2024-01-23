package mz.gov.inage.dnrn.controllers;

import mz.gov.inage.dnrn.entities.BirthCertificate;
import mz.gov.inage.dnrn.repos.IBirthCertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateRestController {
    @Autowired
    IBirthCertificateRepository certificateRepository;

    @RequestMapping("/cidadao/certificado/{nuic}")
    public BirthCertificate getBirthCertifcate(@PathVariable("nuic") String nuic){
        return certificateRepository.findCertificateByNuic(nuic);
    }
}
