package com.api.base;

import com.api.models.request.LoginPayload;
import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends BaseService{
    private static final String BASEPATH = "/api/auth/";
    public Response login(Object payload){
        return postRequest(payload,BASEPATH + "login");
    }
    public Response signUp(Object payload){
        return postRequest(payload,BASEPATH + "signup");
    }
    public Response forgotPassword(String emailAddress){
        HashMap<String,String>payload = new HashMap<>();
        payload.put("email",emailAddress);
        return postRequest(payload,BASEPATH + "forgot-password");
    }
}
