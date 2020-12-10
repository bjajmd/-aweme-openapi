/*
 * 客服会话删除
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

import com.douyin.open.models.EnterprisePersonaPersonaConvDeleteBody;
import com.douyin.open.models.EnterprisePersonaPersonaConvDeleteInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnterpriseImConversationDeleteApi
 */
@Ignore
public class EnterpriseImConversationDeleteApiTest {

    private final EnterpriseImConversationDeleteApi api = new EnterpriseImConversationDeleteApi();

    /**
     * 删除客服会话
     *
     * * Scope: &#x60;enterprise.im&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseImPersonaConversationDeletePostTest() {
        EnterprisePersonaPersonaConvDeleteBody body = null;
        String openId = null;
        String accessToken = null;
        EnterprisePersonaPersonaConvDeleteInlineResponse200 response = api.enterpriseImPersonaConversationDeletePost(body, openId, accessToken);

        // TODO: test validations
    }
}
