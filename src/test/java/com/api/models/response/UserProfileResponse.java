package com.api.models.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserProfileResponse {
    private int id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;
}
