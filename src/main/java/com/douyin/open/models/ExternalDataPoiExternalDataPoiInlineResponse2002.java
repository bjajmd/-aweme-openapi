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
import com.douyin.open.models.ExternalDataPoiExternalDataPoiExtraBody;
import com.douyin.open.models.ExternalDataPoiExternalDataPoiInlineResponse2002Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ExternalDataPoiExternalDataPoiInlineResponse2002
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:15.723137+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataPoiExternalDataPoiInlineResponse2002 {
  @JsonProperty("extra")
  private ExternalDataPoiExternalDataPoiExtraBody extra = null;

  @JsonProperty("data")
  private ExternalDataPoiExternalDataPoiInlineResponse2002Data data = null;

  public ExternalDataPoiExternalDataPoiInlineResponse2002 extra(ExternalDataPoiExternalDataPoiExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public ExternalDataPoiExternalDataPoiExtraBody getExtra() {
    return extra;
  }

  public void setExtra(ExternalDataPoiExternalDataPoiExtraBody extra) {
    this.extra = extra;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2002 data(ExternalDataPoiExternalDataPoiInlineResponse2002Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public ExternalDataPoiExternalDataPoiInlineResponse2002Data getData() {
    return data;
  }

  public void setData(ExternalDataPoiExternalDataPoiInlineResponse2002Data data) {
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
    ExternalDataPoiExternalDataPoiInlineResponse2002 inlineResponse2002 = (ExternalDataPoiExternalDataPoiInlineResponse2002) o;
    return Objects.equals(this.extra, inlineResponse2002.extra) &&
        Objects.equals(this.data, inlineResponse2002.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataPoiExternalDataPoiInlineResponse2002 {\n");
    
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
