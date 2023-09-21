package com.myriad.myriadTest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class UserDTO {
    private Long id;
    private String username;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthdate;
    private String countryofresidence;
    private String number;
    private String gender;


    //Getters
    public Long getId() {
        return id;
    }
    public String getUsername(){return username;}
    public LocalDate getBirthdate(){return birthdate;}
    public String getCountryofresidence(){return countryofresidence;}
    public String getNumber(){return number;}
    public String getGender(){return gender;}


    // Setters
    public void setUsername(String username) {this.username = username;}
    public void setBirthdate(LocalDate birthdate) {this.birthdate = birthdate;}
    public void setCountryofresidence(String countryofresidence) {this.countryofresidence = countryofresidence;}
    public void setNumber(String number) {this.number = number;}
    public void setGender(String gender) {this.gender = gender;}

}
