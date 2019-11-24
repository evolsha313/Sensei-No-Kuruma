package com.example.homepage.Model;

public class Users
{
    private String email, phonennumber, password;

    public Users()
    {

    }

    public Users(String email, String phonennumber, String password) {
        this.email = email;
        this.phonennumber = phonennumber;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonennumber() {
        return phonennumber;
    }

    public void setPhonennumber(String phonennumber) {
        this.phonennumber = phonennumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
