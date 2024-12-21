package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.LoginPayload;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetProfileAPITest {
    @Test
    public void testGetProfileAPI(){
        LoginPayload loginPayload = new LoginPayload();
        loginPayload.setUsername("apiautomation");
        loginPayload.setPassword("test@1234");
        AuthService authService = new AuthService();
        Response response = authService.login(loginPayload);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        String token = loginResponse.getToken();
        System.out.println(token);
        UserManagementService userManagementService = new UserManagementService();
        Response userProfileResponse = userManagementService.getProfile(token);
        System.out.println(userProfileResponse.asPrettyString());
        UserProfileResponse userProfileResponse1 = userProfileResponse.as(UserProfileResponse.class);
        System.out.println(userProfileResponse1.getEmail());

    }
}
