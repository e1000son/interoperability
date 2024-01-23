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
    private int weight;
    @Column(name = "FATHERS_NAME")
    private String fathersName;
    @Column(name = "MOTHERS_NAME")
    private String mothersName;
    private String province;
    private String district;
    private String village;
    @Column(name = "DESCRIPTIO")
    private String descriprion;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weigth) {
        this.weight = weigth;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", dob=" + dob +
                ", weigth=" + weight +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", village='" + village + '\'' +
                ", descriprion='" + descriprion + '\'' +
                '}';
    }
}
