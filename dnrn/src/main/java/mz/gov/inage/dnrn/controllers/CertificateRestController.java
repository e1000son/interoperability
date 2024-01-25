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

    @RequestMapping("/cidadao/certidao/{nuic}")
    public BirthCertificate getBirthCertifcate(@PathVariable("nuic") String nuic){
        return certificateRepository.findCertificateByNuic(nuic);
    }

    @RequestMapping("/cidadao/{id}")
    public BirthCertificate getBirthCertifcateById(@PathVariable("id") Long id){
        return certificateRepository.findById(id).get();
    }
}
