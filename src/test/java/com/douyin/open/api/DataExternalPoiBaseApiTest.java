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

import com.douyin.open.models.ExternalDataPoiExternalDataPoiInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataExternalPoiBaseApi
 */
@Ignore
public class DataExternalPoiBaseApiTest {

    private final DataExternalPoiBaseApi api = new DataExternalPoiBaseApi();

    /**
     * 获取POI基础数据
     *
     * * Scope: &#x60;data.external.poi&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalPoiBaseGetTest() {
        String accessToken = null;
        String poiId = null;
        String beginDate = null;
        String endDate = null;
        ExternalDataPoiExternalDataPoiInlineResponse200 response = api.dataExternalPoiBaseGet(accessToken, poiId, beginDate, endDate);

        // TODO: test validations
    }
}
