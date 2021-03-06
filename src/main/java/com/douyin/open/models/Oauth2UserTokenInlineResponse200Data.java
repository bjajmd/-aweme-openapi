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
 * Oauth2UserTokenInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:01.574845+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Oauth2UserTokenInlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("expires_in")
  private Integer expiresIn = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("refresh_expires_in")
  private Integer refreshExpiresIn = null;

  @JsonProperty("open_id")
  private String openId = null;

  @JsonProperty("scope")
  private String scope = null;

  public Oauth2UserTokenInlineResponse200Data errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public Oauth2UserTokenInlineResponse200Data description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Oauth2UserTokenInlineResponse200Data accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * ??????????????????
   * @return accessToken
  **/
  @Schema(example = "access_token", description = "??????????????????")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public Oauth2UserTokenInlineResponse200Data expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * access_token?????????????????????????????????????????????)
   * @return expiresIn
  **/
  @Schema(example = "86400", description = "access_token?????????????????????????????????????????????)")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public Oauth2UserTokenInlineResponse200Data refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * ????????????access_token
   * @return refreshToken
  **/
  @Schema(example = "refresh_token", description = "????????????access_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public Oauth2UserTokenInlineResponse200Data refreshExpiresIn(Integer refreshExpiresIn) {
    this.refreshExpiresIn = refreshExpiresIn;
    return this;
  }

   /**
   * refresh_token?????????????????????????????????)
   * @return refreshExpiresIn
  **/
  @Schema(example = "86400", description = "refresh_token?????????????????????????????????)")
  public Integer getRefreshExpiresIn() {
    return refreshExpiresIn;
  }

  public void setRefreshExpiresIn(Integer refreshExpiresIn) {
    this.refreshExpiresIn = refreshExpiresIn;
  }

  public Oauth2UserTokenInlineResponse200Data openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * ????????????????????????
   * @return openId
  **/
  @Schema(example = "aaa-bbb-ccc", description = "????????????????????????")
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public Oauth2UserTokenInlineResponse200Data scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * ????????????????????????(Scope)??????????????????,??????????????????????????????????????????????????????????????????Scope??? 
   * @return scope
  **/
  @Schema(example = "user_info", description = "????????????????????????(Scope)??????????????????,??????????????????????????????????????????????????????????????????Scope??? ")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2UserTokenInlineResponse200Data inlineResponse200Data = (Oauth2UserTokenInlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.accessToken, inlineResponse200Data.accessToken) &&
        Objects.equals(this.expiresIn, inlineResponse200Data.expiresIn) &&
        Objects.equals(this.refreshToken, inlineResponse200Data.refreshToken) &&
        Objects.equals(this.refreshExpiresIn, inlineResponse200Data.refreshExpiresIn) &&
        Objects.equals(this.openId, inlineResponse200Data.openId) &&
        Objects.equals(this.scope, inlineResponse200Data.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, accessToken, expiresIn, refreshToken, refreshExpiresIn, openId, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Oauth2UserTokenInlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshExpiresIn: ").append(toIndentedString(refreshExpiresIn)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
