/*
 * 查看券码状态
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

import com.douyin.open.models.EnterpriseGrouponGrouponCodeCodeStatusBody;
import com.douyin.open.models.EnterpriseGrouponGrouponCodeCodeStatusInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnterpriseGrouponCodeStatusApi
 */
@Ignore
public class EnterpriseGrouponCodeStatusApiTest {

    private final EnterpriseGrouponCodeStatusApi api = new EnterpriseGrouponCodeStatusApi();

    /**
     * 查看券码状态
     *
     * * Scope: &#x60;enterprise.groupon&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseGrouponCodeStatusPostTest() {
        String accessToken = null;
        String openId = null;
        EnterpriseGrouponGrouponCodeCodeStatusBody body = null;
        EnterpriseGrouponGrouponCodeCodeStatusInlineResponse200 response = api.enterpriseGrouponCodeStatusPost(accessToken, openId, body);

        // TODO: test validations
    }
}
