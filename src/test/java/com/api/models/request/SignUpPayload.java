package com.api.models.request;

public class SignUpPayload {
    private String username;

    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    public String getUsername() {
        return username;
    }
    public SignUpPayload setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getPassword() {
        return password;
    }
    public SignUpPayload setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getEmail() {
        return email;
    }
    public SignUpPayload setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getFirstName() {
        return firstName;
    }
    public SignUpPayload setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public String getLastName() {
        return lastName;
    }
    public SignUpPayload setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public SignUpPayload setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public static class Builder {

    }

}
