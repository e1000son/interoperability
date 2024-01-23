package mz.gov.inage.dnrn.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class BirthCertificate extends AbstractEntity{
    private String NUIC;
    @Column(name = "REGISTR_CONSERVAT")
    private String ConservatoryOfRegistration;
    @Column(name = " REGISTR_DATE")
    private Timestamp registeredDate;
    @Column(name = "STATE_CITIZEN")
    private String citizenState;
    private String endorsment;
    private String address;
    @Column(name = "DESCRIPTIO")
    private String description;

    @Override
    public String toString() {
        return "BirthCertificate{" +
                "NUIC='" + NUIC + '\'' +
                ", ConservatoryOfRegistration='" + ConservatoryOfRegistration + '\'' +
                ", registeredDate=" + registeredDate +
                ", citizenState='" + citizenState + '\'' +
                ", endorsment='" + endorsment + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
