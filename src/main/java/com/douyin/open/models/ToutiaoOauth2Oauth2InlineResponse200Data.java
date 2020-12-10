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
 * ToutiaoOauth2Oauth2InlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:07.108677+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ToutiaoOauth2Oauth2InlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("expires_in")
  private String expiresIn = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("open_id")
  private String openId = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("unionid")
  private String unionid = null;

  public ToutiaoOauth2Oauth2InlineResponse200Data errorCode(Integer errorCode) {
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

  public ToutiaoOauth2Oauth2InlineResponse200Data description(String description) {
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

  public ToutiaoOauth2Oauth2InlineResponse200Data accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * 接口调用凭证
   * @return accessToken
  **/
  @Schema(example = "access_token", description = "接口调用凭证")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ToutiaoOauth2Oauth2InlineResponse200Data expiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * access_token接口调用凭证超时时间，单位（秒
   * @return expiresIn
  **/
  @Schema(example = "86400", description = "access_token接口调用凭证超时时间，单位（秒")
  public String getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }

  public ToutiaoOauth2Oauth2InlineResponse200Data refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * 用户刷新access_token
   * @return refreshToken
  **/
  @Schema(example = "refresh_token", description = "用户刷新access_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public ToutiaoOauth2Oauth2InlineResponse200Data openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * 授权用户唯一标识
   * @return openId
  **/
  @Schema(example = "aaa-bbb-ccc", description = "授权用户唯一标识")
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public ToutiaoOauth2Oauth2InlineResponse200Data scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * 用户授权的作用域(Scope)，使用逗号（,）分隔，开放平台几乎几乎每个接口都需要特定的Scope。 
   * @return scope
  **/
  @Schema(example = "user_info", description = "用户授权的作用域(Scope)，使用逗号（,）分隔，开放平台几乎几乎每个接口都需要特定的Scope。 ")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public ToutiaoOauth2Oauth2InlineResponse200Data unionid(String unionid) {
    this.unionid = unionid;
    return this;
  }

   /**
   * 当且仅当该网站应用已获得该用户的userinfo授权时，才会出现该字段。
   * @return unionid
  **/
  @Schema(example = "ccc-ddd-eee-fff", description = "当且仅当该网站应用已获得该用户的userinfo授权时，才会出现该字段。")
  public String getUnionid() {
    return unionid;
  }

  public void setUnionid(String unionid) {
    this.unionid = unionid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToutiaoOauth2Oauth2InlineResponse200Data inlineResponse200Data = (ToutiaoOauth2Oauth2InlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.accessToken, inlineResponse200Data.accessToken) &&
        Objects.equals(this.expiresIn, inlineResponse200Data.expiresIn) &&
        Objects.equals(this.refreshToken, inlineResponse200Data.refreshToken) &&
        Objects.equals(this.openId, inlineResponse200Data.openId) &&
        Objects.equals(this.scope, inlineResponse200Data.scope) &&
        Objects.equals(this.unionid, inlineResponse200Data.unionid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, accessToken, expiresIn, refreshToken, openId, scope, unionid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToutiaoOauth2Oauth2InlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    unionid: ").append(toIndentedString(unionid)).append("\n");
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
