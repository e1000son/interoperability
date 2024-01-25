package com.e1000son.dinc.integration;

import com.e1000son.dinc.integration.dto.CertificateFromDNRN;

public interface IRestClientDNRN{
    public CertificateFromDNRN findCitizenDNRN(String nuic);
}
