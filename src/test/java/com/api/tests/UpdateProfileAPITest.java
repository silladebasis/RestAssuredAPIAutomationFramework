package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.LoginPayload;
import com.api.models.request.ProfileRequestPayload;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UpdateProfileAPITest {
    @Test
    public void testUpdateProfileAPI(){
        LoginPayload loginPayload = new LoginPayload();
        loginPayload.setUsername("apiautomation");
        loginPayload.setPassword("test@1234");

        AuthService authService = new AuthService();
        Response response = authService.login(loginPayload);
        LoginResponse loginResponse = response.as(LoginResponse.class);

        ProfileRequestPayload payload = new ProfileRequestPayload();
        payload.setFirstName("apis").setLastName("automation5").setEmail("testapiautomation@gmail.com").setMobileNumber("1476124176");

        UserManagementService userManagementService = new UserManagementService();
        Response updatedProfileResponse = userManagementService.updateProfile(payload, loginResponse.getToken());
        System.out.println(updatedProfileResponse.asPrettyString());

        Response userProfileResponse = userManagementService.getProfile(loginResponse.getToken());
        System.out.println(userProfileResponse.asPrettyString());
    }
}
