/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.api;

import com.douyin.open.models.Oauth2NewRefreshTokenInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RenewRefreshTokenApi
 */
@Ignore
public class RenewRefreshTokenApiTest {

    private final RenewRefreshTokenApi api = new RenewRefreshTokenApi();

    /**
     * 刷新refresh_token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oauthRenewRefreshTokenGetTest() {
        String clientKey = null;
        String refreshToken = null;
        Oauth2NewRefreshTokenInlineResponse200 response = api.oauthRenewRefreshTokenGet(clientKey, refreshToken);

        // TODO: test validations
    }
}
