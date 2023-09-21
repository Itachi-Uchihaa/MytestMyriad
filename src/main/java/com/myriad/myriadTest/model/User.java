package com.myriad.myriadTest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@Entity
@Table(name = "`user`") // Utilisez des guillemets inversés autour de "user"
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    @Bean
    public String UserDetailsService() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", countryofresidence=" + countryofresidence + '\'' +
                ", number=" + number + '\'' +
                ", gender=" + gender + '\'' +
                '}';
    }

}
