package com.e1000son.dinc.integration;

import com.e1000son.dinc.integration.dto.CertificateFromDNRN;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClientDNRNImpl implements IRestClientDNRN{

    @Override
    public CertificateFromDNRN findCitizenDNRN(String nuic) {
        RestTemplate restTemplate = new RestTemplate();
        CertificateFromDNRN certificateFromDNRN = restTemplate.getForObject(
                "http://10.5.251.50:5001/cidadao/informacao?nuic=" + nuic,
                CertificateFromDNRN.class);
        return certificateFromDNRN;
    }
}
