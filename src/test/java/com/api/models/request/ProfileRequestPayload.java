package com.api.models.request;

public class ProfileRequestPayload {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    public String getFirstName() {
        return firstName;
    }
    public ProfileRequestPayload setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public String getLastName() {
        return lastName;
    }
    public ProfileRequestPayload setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public String getEmail() {
        return email;
    }
    public ProfileRequestPayload setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public ProfileRequestPayload setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
}
