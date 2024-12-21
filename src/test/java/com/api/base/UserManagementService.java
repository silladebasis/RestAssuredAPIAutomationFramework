package com.api.base;

import io.restassured.response.Response;

public class UserManagementService extends BaseService{
    private static final String BASEPATH = "/api/users/";
    public Response getProfile(String token){
        setAuthToken(token);
        return getRequest(BASEPATH+"profile");
    }
    public Response updateProfile(Object payload,String token){
        setAuthToken(token);
        return putRequest(payload,BASEPATH + "profile");
    }
}
