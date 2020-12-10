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
 * UserUserInfoUserInfoInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:13.023944+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserUserInfoUserInfoInlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("open_id")
  private String openId = null;

  @JsonProperty("union_id")
  private String unionId = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("province")
  private String province = null;

  @JsonProperty("country")
  private String country = null;

  /**
   * 性别:   * &#x60;0&#x60; - 未知   * &#x60;1&#x60; - 男性   * &#x60;2&#x60; - 女性 
   */
  public enum GenderEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    GenderEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("gender")
  private GenderEnum gender = null;

  /**
   * 类型:   * &#x60;EAccountM&#x60; - 普通企业号   * &#x60;EAccountS&#x60; - 认证企业号   * &#x60;EAccountK&#x60; - 品牌企业号 
   */
  public enum EAccountRoleEnum {
    EACCOUNTM("EAccountM"),
    EACCOUNTS("EAccountS"),
    EACCOUNTK("EAccountK");

    private String value;

    EAccountRoleEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static EAccountRoleEnum fromValue(String text) {
      for (EAccountRoleEnum b : EAccountRoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("e_account_role")
  private EAccountRoleEnum eAccountRole = null;

  public UserUserInfoUserInfoInlineResponse200Data errorCode(Integer errorCode) {
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

  public UserUserInfoUserInfoInlineResponse200Data description(String description) {
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

  public UserUserInfoUserInfoInlineResponse200Data openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * 用户在当前应用的唯一标识
   * @return openId
  **/
  @Schema(example = "0da22181-d833-447f-995f-1beefea5bef3", description = "用户在当前应用的唯一标识")
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public UserUserInfoUserInfoInlineResponse200Data unionId(String unionId) {
    this.unionId = unionId;
    return this;
  }

   /**
   * 用户在当前开发者账号下的唯一标识（未绑定开发者账号没有该字段）
   * @return unionId
  **/
  @Schema(example = "1ad4e099-4a0c-47d1-a410-bffb4f2f64a4", description = "用户在当前开发者账号下的唯一标识（未绑定开发者账号没有该字段）")
  public String getUnionId() {
    return unionId;
  }

  public void setUnionId(String unionId) {
    this.unionId = unionId;
  }

  public UserUserInfoUserInfoInlineResponse200Data nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @Schema(example = "张伟", description = "")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public UserUserInfoUserInfoInlineResponse200Data avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @Schema(example = "https://example.com/x.jpeg", description = "")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public UserUserInfoUserInfoInlineResponse200Data city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(example = "上海", description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UserUserInfoUserInfoInlineResponse200Data province(String province) {
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @Schema(example = "上海", description = "")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public UserUserInfoUserInfoInlineResponse200Data country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(example = "中国", description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public UserUserInfoUserInfoInlineResponse200Data gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * 性别:   * &#x60;0&#x60; - 未知   * &#x60;1&#x60; - 男性   * &#x60;2&#x60; - 女性 
   * @return gender
  **/
  @Schema(description = "性别:   * `0` - 未知   * `1` - 男性   * `2` - 女性 ")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public UserUserInfoUserInfoInlineResponse200Data eAccountRole(EAccountRoleEnum eAccountRole) {
    this.eAccountRole = eAccountRole;
    return this;
  }

   /**
   * 类型:   * &#x60;EAccountM&#x60; - 普通企业号   * &#x60;EAccountS&#x60; - 认证企业号   * &#x60;EAccountK&#x60; - 品牌企业号 
   * @return eAccountRole
  **/
  @Schema(description = "类型:   * `EAccountM` - 普通企业号   * `EAccountS` - 认证企业号   * `EAccountK` - 品牌企业号 ")
  public EAccountRoleEnum getEAccountRole() {
    return eAccountRole;
  }

  public void setEAccountRole(EAccountRoleEnum eAccountRole) {
    this.eAccountRole = eAccountRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUserInfoUserInfoInlineResponse200Data inlineResponse200Data = (UserUserInfoUserInfoInlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.openId, inlineResponse200Data.openId) &&
        Objects.equals(this.unionId, inlineResponse200Data.unionId) &&
        Objects.equals(this.nickname, inlineResponse200Data.nickname) &&
        Objects.equals(this.avatar, inlineResponse200Data.avatar) &&
        Objects.equals(this.city, inlineResponse200Data.city) &&
        Objects.equals(this.province, inlineResponse200Data.province) &&
        Objects.equals(this.country, inlineResponse200Data.country) &&
        Objects.equals(this.gender, inlineResponse200Data.gender) &&
        Objects.equals(this.eAccountRole, inlineResponse200Data.eAccountRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, openId, unionId, nickname, avatar, city, province, country, gender, eAccountRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserInfoUserInfoInlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    unionId: ").append(toIndentedString(unionId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    eAccountRole: ").append(toIndentedString(eAccountRole)).append("\n");
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
