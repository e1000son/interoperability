package com.e1000son.dinc.integration;

import com.e1000son.dinc.integration.dto.BirthCertificate;
import org.springframework.web.client.RestTemplate;

public class DNICRestImpl implements IDNICRestClient{
    @Override
    public BirthCertificate findCitizen(String nuic) {
        RestTemplate restTemplate = new RestTemplate();
        BirthCertificate birthCertificate = restTemplate.getForObject("http://localhost:8080/v1.0/dnrn_birth_registration/citizens/" + nuic,
                BirthCertificate.class);
        return birthCertificate;
    }
}
