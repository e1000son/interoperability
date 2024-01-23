package mz.gov.inage.dnrn.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Citizen extends AbstractEntity{
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    private String sex;
    private Date dob;
    private int weigth;
    @Column(name = "FATHERS_NAME")
    private String fathersName;
    @Column(name = "MOTHERS_NAME")
    private String mothersName;
    private String province;
    private String district;
    private String village;
    @Column(name = "DESCRIPTIO")
    private String descriprion;

    @Override
    public String toString() {
        return "Citizen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", dob=" + dob +
                ", weigth=" + weigth +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", village='" + village + '\'' +
                ", descriprion='" + descriprion + '\'' +
                '}';
    }
}
