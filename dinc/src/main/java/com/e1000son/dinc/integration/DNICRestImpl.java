package com.e1000son.dinc.integration;

import com.e1000son.dinc.integration.dto.BirthCertificate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DNICRestImpl implements IDNICRestClient{
    @Override
    public BirthCertificate findCitizen(String nuic) {
        RestTemplate restTemplate = new RestTemplate();
        BirthCertificate birthCertificate = restTemplate.getForObject(
                "http://localhost:8080/v1.0/dnrn/cidadao/certidao/" + nuic,
                BirthCertificate.class);
        return birthCertificate;
    }
}
