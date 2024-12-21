package com.api.models.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
public class LoginResponse {
    private String token;
    private String type;
    private int id;
    private String username;
    private String email;
    private List<String>roles;
}
