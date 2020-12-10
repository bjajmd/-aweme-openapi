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
 * PoiOrderOrderInlineResponse2001
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:06.711814+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiOrderOrderInlineResponse2001 {
  @JsonProperty("order_ext_id")
  private String orderExtId = null;

  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  public PoiOrderOrderInlineResponse2001 orderExtId(String orderExtId) {
    this.orderExtId = orderExtId;
    return this;
  }

   /**
   * 外部订单id
   * @return orderExtId
  **/
  @Schema(required = true, description = "外部订单id")
  public String getOrderExtId() {
    return orderExtId;
  }

  public void setOrderExtId(String orderExtId) {
    this.orderExtId = orderExtId;
  }

  public PoiOrderOrderInlineResponse2001 errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public PoiOrderOrderInlineResponse2001 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiOrderOrderInlineResponse2001 inlineResponse2001 = (PoiOrderOrderInlineResponse2001) o;
    return Objects.equals(this.orderExtId, inlineResponse2001.orderExtId) &&
        Objects.equals(this.errorCode, inlineResponse2001.errorCode) &&
        Objects.equals(this.description, inlineResponse2001.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderExtId, errorCode, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiOrderOrderInlineResponse2001 {\n");
    
    sb.append("    orderExtId: ").append(toIndentedString(orderExtId)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
