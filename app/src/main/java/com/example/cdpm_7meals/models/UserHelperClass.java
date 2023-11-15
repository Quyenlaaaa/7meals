package com.example.cdpm_7meals.models;

public class UserHelperClass {
    String firstname, lastname, phonenum, adress , password;

    public UserHelperClass() {
    }

    public UserHelperClass(String firstname, String lastname, String phonenum, String adress, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenum = phonenum;
        this.adress = adress;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
