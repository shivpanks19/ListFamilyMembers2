package com.example.ftree;

import java.time.Year;

public class Person {
    private String name;
    private String surname;
    private  int date;
    private  int month;
    private  int year;
    private String hash_id;
    private String email;
    private int gender_id;
    private String pob;

    public Person(String name, String surname, int gender_id, int dateOfBirth_dayOfMonth, int dateOfBirth_month, int dateOfBirth_year, String hash_id, String email,String pob) {
        this.name = name;
        this.surname = surname;
        this.date = dateOfBirth_dayOfMonth;
        this.month = dateOfBirth_month;
        this.year = dateOfBirth_year;
        this.hash_id = hash_id;
        this.email = email;
        this.gender_id = gender_id;
        this.pob = pob;
    }

    public Person(String name, String surname, int date,int month,int year,String hash_id) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.month = month;
        this.year = year;
        this.hash_id = hash_id;
    }

    public String getname() {
        return name;
    }
    public String getsurname() {
        return surname;
    }
    public String getHash_id() {
        return hash_id;
    }
    public int getDate() {
        return date;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String getEmail(){return email;}
    public String getPOB(){return pob;}

}