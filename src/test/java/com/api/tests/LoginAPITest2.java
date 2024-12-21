package com.api.tests;

import com.api.base.AuthService;
import com.api.base.BaseService;
import com.api.listeners.TestListener;
import com.api.models.request.LoginPayload;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class LoginAPITest2 extends BaseService {
    @Test
    public void testLoginAPI(){
        LoginPayload loginPayload = new LoginPayload();
        loginPayload.setUsername("apiautomation");
        loginPayload.setPassword("test@1234");
        AuthService authService = new AuthService();
        Response response = authService.login(loginPayload);
        //System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());
        System.out.println(loginResponse.getUsername());
        Assert.assertNotNull(loginResponse.getToken());
        Assert.assertEquals(loginResponse.getUsername(),"apiautomation");
    }
}
