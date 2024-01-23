package mz.gov.inage.dnrn.services;

import mz.gov.inage.dnrn.dto.BirthCertificateRequest;
import mz.gov.inage.dnrn.entities.BirthCertificate;

public interface IBirthCertificateService {
    public BirthCertificate saveCertificate(BirthCertificateRequest certificateRequest);
}
