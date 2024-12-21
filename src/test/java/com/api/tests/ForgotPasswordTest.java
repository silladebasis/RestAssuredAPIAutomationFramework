package com.api.tests;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordTest {
    @Test
    public void testForgotPasswordAPI(){
        AuthService authService = new AuthService();
        Response response = authService.forgotPassword("apiautomation@gmail.com");
        System.out.println(response.asPrettyString());
    }
}
