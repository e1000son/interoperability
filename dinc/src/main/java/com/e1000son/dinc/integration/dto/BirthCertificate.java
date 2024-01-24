package com.e1000son.dinc.integration.dto;

import java.sql.Timestamp;

public class BirthCertificate{
    private Long id;
    private String nuic;
    private String conservatoryOfRegistration;
    private Timestamp registeredDate;
    private String citizenState;
    private String endorsment;
    private String address;
    private String description;
    private Citizen citizen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNuic() {
        return nuic;
    }

    public void setNuic(String nuic) {
        this.nuic = nuic;
    }

    public String getConservatoryOfRegistration() {
        return conservatoryOfRegistration;
    }

    public void setConservatoryOfRegistration(String conservatoryOfRegistration) {
        this.conservatoryOfRegistration = conservatoryOfRegistration;
    }

    public Timestamp getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Timestamp registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getCitizenState() {
        return citizenState;
    }

    public void setCitizenState(String citizenState) {
        this.citizenState = citizenState;
    }

    public String getEndorsment() {
        return endorsment;
    }

    public void setEndorsment(String endorsment) {
        this.endorsment = endorsment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    @Override
    public String toString() {
        return "BirthCertificate{" +
                "NUIC='" + nuic + '\'' +
                ", ConservatoryOfRegistration='" + conservatoryOfRegistration + '\'' +
                ", registeredDate=" + registeredDate +
                ", citizenState='" + citizenState + '\'' +
                ", endorsment='" + endorsment + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
