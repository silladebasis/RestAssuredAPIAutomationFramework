package com.api.models.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginPayload {
    private String username;
    private String password;
}
