package com.e1000son.dinc.integration.dto;

import java.sql.Timestamp;
import java.util.Date;

public class BirthCertificate{

    private String nuic;

    private String firstName;

    private String lastName;
    private String sex;
    private Date dob;

    private String father;

    private String mother;
    private String state;
    private Integer weight;
    private String province;
    private String district;
    private String village;
    private String descriptio;

    private Timestamp registeredDate;

//    @OneToOne
//    private Citizen citizen;
//    @OneToOne
//    private PlaceOfBirth placeOfBirth;

    public String getNuic() {
        return nuic;
    }
    public void setNuic(String nuic) {
        this.nuic = nuic;
    }

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

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
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

    public String getDescriptio() {
        return descriptio;
    }

    public void setDescriptio(String descriptio) {
        this.descriptio = descriptio;
    }

    public Timestamp getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Timestamp registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Override
    public String toString() {
        return "BirthCertificate{" +
                "nuic='" + nuic + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", dob=" + dob +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", state='" + state + '\'' +
                ", weight=" + weight +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", village='" + village + '\'' +
                ", descriptio='" + descriptio + '\'' +
                ", registeredDate=" + registeredDate +
                '}';
    }
}
