/*
 * 团购活动列表
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

import com.douyin.open.models.EnterpriseGrouponGrouponGrouponListInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnterpriseGrouponListApi
 */
@Ignore
public class EnterpriseGrouponListApiTest {

    private final EnterpriseGrouponListApi api = new EnterpriseGrouponListApi();

    /**
     * 团购活动列表
     *
     * * Scope: &#x60;enterprise.groupon&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseGrouponListGetTest() {
        String accessToken = null;
        String openId = null;
        Integer count = null;
        Long cursor = null;
        Integer status = null;
        EnterpriseGrouponGrouponGrouponListInlineResponse200 response = api.enterpriseGrouponListGet(accessToken, openId, count, cursor, status);

        // TODO: test validations
    }
}
