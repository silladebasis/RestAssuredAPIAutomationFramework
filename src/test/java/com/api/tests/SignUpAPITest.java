package com.api.tests;

import com.api.base.AuthService;
import com.api.base.BaseService;
import com.api.models.request.SignUpPayload;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpAPITest {
    @Test
    public void testSignUpAPI(){
        SignUpPayload signUpPayload = new SignUpPayload();
        signUpPayload.setUsername("apiautomation1").setPassword("test@12345").setEmail("apiautomation1@gmail.com").
                     setFirstName("test").setLastName("automation").setMobileNumber("0474287336");
        AuthService authService = new AuthService();
        Response response = authService.signUp(signUpPayload);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.asPrettyString(),"User registered successfully!");
    }
}
