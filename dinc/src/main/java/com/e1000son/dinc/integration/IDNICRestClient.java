package com.e1000son.dinc.integration;

import com.e1000son.dinc.integration.dto.BirthCertificate;

public interface IDNICRestClient {
    public BirthCertificate findCitizen(String nuit);
}
