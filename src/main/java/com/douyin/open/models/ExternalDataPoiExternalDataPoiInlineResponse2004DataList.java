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

package com.douyin.open.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ExternalDataPoiExternalDataPoiInlineResponse2004DataList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:15.723137+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataPoiExternalDataPoiInlineResponse2004DataList {
  @JsonProperty("poi_id")
  private String poiId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private String address = null;

  public ExternalDataPoiExternalDataPoiInlineResponse2004DataList poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * poi的Id
   * @return poiId
  **/
  @Schema(description = "poi的Id")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2004DataList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * poi名称
   * @return name
  **/
  @Schema(description = "poi名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2004DataList address(String address) {
    this.address = address;
    return this;
  }

   /**
   * 地址详情
   * @return address
  **/
  @Schema(description = "地址详情")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataPoiExternalDataPoiInlineResponse2004DataList inlineResponse2004DataList = (ExternalDataPoiExternalDataPoiInlineResponse2004DataList) o;
    return Objects.equals(this.poiId, inlineResponse2004DataList.poiId) &&
        Objects.equals(this.name, inlineResponse2004DataList.name) &&
        Objects.equals(this.address, inlineResponse2004DataList.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiId, name, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataPoiExternalDataPoiInlineResponse2004DataList {\n");
    
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
