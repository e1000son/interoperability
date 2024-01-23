package mz.gov.inage.dnrn.services;

import mz.gov.inage.dnrn.dto.BirthCertificateRequest;
import mz.gov.inage.dnrn.entities.BirthCertificate;
import mz.gov.inage.dnrn.entities.Citizen;
import mz.gov.inage.dnrn.repos.IBirthCertificateRepository;
import mz.gov.inage.dnrn.repos.ICitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
@Service
public class BirthCertificateServiceImpl implements IBirthCertificateService{
    @Autowired
    ICitizenRepository citizenRepository;
    @Autowired
    IBirthCertificateRepository certificateRepository;
    @Override
    public BirthCertificate saveCertificate(BirthCertificateRequest certificateRequest) {

        Citizen citizen = getCitizen(certificateRequest);
        Citizen savedCitizen = citizenRepository.save(citizen);

        BirthCertificate birthCertificate = new BirthCertificate();
        birthCertificate.setNuic(certificateRequest.getNuic());
        birthCertificate.setConservatoryOfRegistration(certificateRequest.getRegistrConservatory());
        birthCertificate.setRegisteredDate(new Timestamp(new Date().getTime()));
        birthCertificate.setCitizenState(certificateRequest.getCitizenState());
        birthCertificate.setAddress(certificateRequest.getConservatoryAddress());
        birthCertificate.setDescription(certificateRequest.getDescriptio());
        birthCertificate.setCitizen(savedCitizen);
        BirthCertificate savedBirthCertificate = certificateRepository.save(birthCertificate);

        return savedBirthCertificate;
    }

    private static Citizen getCitizen(BirthCertificateRequest certificateRequest) {
        Citizen citizen = new Citizen();
        citizen.setFirstName(certificateRequest.getFirstName());
        citizen.setLastName(certificateRequest.getLastName());
        citizen.setSex(certificateRequest.getSex());
        citizen.setDob(new Date());
        citizen.setWeight(certificateRequest.getWeight());
        citizen.setFathersName(certificateRequest.getFather());
        citizen.setMothersName(certificateRequest.getMother());
        citizen.setProvince(certificateRequest.getProvince());
        citizen.setDistrict(certificateRequest.getDistrict());
        citizen.setVillage(certificateRequest.getVillage());
        citizen.setDescriprion(certificateRequest.getDescriptio());
        return citizen;
    }
}
