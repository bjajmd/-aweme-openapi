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
 * PoiOrderOrderPoiexthotelordercommitCustomerList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:06.711814+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiOrderOrderPoiexthotelordercommitCustomerList {
  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("given_name")
  private String givenName = null;

  @JsonProperty("cn_name")
  private String cnName = null;

  public PoiOrderOrderPoiexthotelordercommitCustomerList surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * 英文姓
   * @return surname
  **/
  @Schema(example = "bryant", description = "英文姓")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public PoiOrderOrderPoiexthotelordercommitCustomerList givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * 英文名
   * @return givenName
  **/
  @Schema(example = "kobe", description = "英文名")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public PoiOrderOrderPoiexthotelordercommitCustomerList cnName(String cnName) {
    this.cnName = cnName;
    return this;
  }

   /**
   * 中文全称
   * @return cnName
  **/
  @Schema(example = "韩梅梅", description = "中文全称")
  public String getCnName() {
    return cnName;
  }

  public void setCnName(String cnName) {
    this.cnName = cnName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiOrderOrderPoiexthotelordercommitCustomerList poiexthotelordercommitCustomerList = (PoiOrderOrderPoiexthotelordercommitCustomerList) o;
    return Objects.equals(this.surname, poiexthotelordercommitCustomerList.surname) &&
        Objects.equals(this.givenName, poiexthotelordercommitCustomerList.givenName) &&
        Objects.equals(this.cnName, poiexthotelordercommitCustomerList.cnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surname, givenName, cnName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiOrderOrderPoiexthotelordercommitCustomerList {\n");
    
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
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