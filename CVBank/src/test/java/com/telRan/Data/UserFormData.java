package com.telRan.Data;

public class UserFormData {
    private String firstName;
    private String name;
    private String email;
    private String phone;
    private String pass;
    private String confirmPass;

    public UserFormData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserFormData setName(String name) {
        this.name = name;
        return this;
    }

    public UserFormData setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserFormData setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserFormData setPass(String pass) {
        this.pass = pass;
        return this;

    }




    public UserFormData setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPass() {
        return pass;
    }

    public String getConfirmPass() {
        return confirmPass;
    }
}
