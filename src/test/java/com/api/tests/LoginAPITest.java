package com.api.tests;

import com.api.base.AuthService;
import com.api.base.BaseService;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginAPITest extends BaseService {
    @Test
    public void testLoginAPI(){
        //RestAssured.baseURI = "http://64.227.160.186:8080";
        String payload = "{\n" +
                "  \"username\": \"apiautomation\",\n" +
                "  \"password\": \"test@1234\"\n" +
                "}";
        /*Response response = given().spec(requestSpecification).basePath("/api/auth/login").
                                    body(payload).
                                    when().post();*/
        AuthService authService = new AuthService();
        Response response = authService.login(payload);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
