/*
 * 创建动态消息卡片
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
 * EnterpriseImFancyCardCardSaveModuleAction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:10:06.392159+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseImFancyCardCardSaveModuleAction {
  /**
   * 卡片模块动作
   */
  public enum ActionTypeEnum {
    API("api"),
    H5("h5"),
    NATIVE("native"),
    REACT_NATIVE("react-native");

    private String value;

    ActionTypeEnum(String value) {
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
    public static ActionTypeEnum fromValue(String text) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("action_type")
  private ActionTypeEnum actionType = null;

  @JsonProperty("api")
  private String api = null;

  @JsonProperty("url")
  private String url = null;

  public EnterpriseImFancyCardCardSaveModuleAction actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * 卡片模块动作
   * @return actionType
  **/
  @Schema(example = "api", required = true, description = "卡片模块动作")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public EnterpriseImFancyCardCardSaveModuleAction api(String api) {
    this.api = api;
    return this;
  }

   /**
   * api类型action的api名称
   * @return api
  **/
  @Schema(example = "get_phone_leads", description = "api类型action的api名称")
  public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public EnterpriseImFancyCardCardSaveModuleAction url(String url) {
    this.url = url;
    return this;
  }

   /**
   * 跳转类动作对应的跳转链接
   * @return url
  **/
  @Schema(example = "https://e.douyin.com", description = "跳转类动作对应的跳转链接")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseImFancyCardCardSaveModuleAction moduleAction = (EnterpriseImFancyCardCardSaveModuleAction) o;
    return Objects.equals(this.actionType, moduleAction.actionType) &&
        Objects.equals(this.api, moduleAction.api) &&
        Objects.equals(this.url, moduleAction.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, api, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseImFancyCardCardSaveModuleAction {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
