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
import com.douyin.open.models.DouyinPayDouyinPayExtraBody;
import com.douyin.open.models.DouyinPayDouyinPayInlineResponse2001Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * DouyinPayDouyinPayInlineResponse2001
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:01.836807+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class DouyinPayDouyinPayInlineResponse2001 {
  @JsonProperty("extra")
  private DouyinPayDouyinPayExtraBody extra = null;

  @JsonProperty("data")
  private DouyinPayDouyinPayInlineResponse2001Data data = null;

  public DouyinPayDouyinPayInlineResponse2001 extra(DouyinPayDouyinPayExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public DouyinPayDouyinPayExtraBody getExtra() {
    return extra;
  }

  public void setExtra(DouyinPayDouyinPayExtraBody extra) {
    this.extra = extra;
  }

  public DouyinPayDouyinPayInlineResponse2001 data(DouyinPayDouyinPayInlineResponse2001Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public DouyinPayDouyinPayInlineResponse2001Data getData() {
    return data;
  }

  public void setData(DouyinPayDouyinPayInlineResponse2001Data data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouyinPayDouyinPayInlineResponse2001 inlineResponse2001 = (DouyinPayDouyinPayInlineResponse2001) o;
    return Objects.equals(this.extra, inlineResponse2001.extra) &&
        Objects.equals(this.data, inlineResponse2001.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouyinPayDouyinPayInlineResponse2001 {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
