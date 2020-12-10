/*
 * 团购活动事件回调
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
 * EnterpriseGrouponGrouponCommonGrouponEventCodeInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:13.558916+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseGrouponGrouponCommonGrouponEventCodeInfo {
  @JsonProperty("groupon_id")
  private String grouponId = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("start_time")
  private Long startTime = null;

  @JsonProperty("end_time")
  private Long endTime = null;

  @JsonProperty("confirm_time")
  private Integer confirmTime = null;

  /**
   * * 劵码的状态   * -1: 不存在   * 1: 未核销   * 2: 已核销 
   */
  public enum StatusEnum {
    NUMBER_MINUS_1(-1),
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    StatusEnum(Integer value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("status")
  private StatusEnum status = null;

  public EnterpriseGrouponGrouponCommonGrouponEventCodeInfo grouponId(String grouponId) {
    this.grouponId = grouponId;
    return this;
  }

   /**
   * 团购活动的ID
   * @return grouponId
  **/
  @Schema(description = "团购活动的ID")
  public String getGrouponId() {
    return grouponId;
  }

  public void setGrouponId(String grouponId) {
    this.grouponId = grouponId;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventCodeInfo code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 劵码值
   * @return code
  **/
  @Schema(description = "劵码值")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventCodeInfo startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 劵码有效的起始时间
   * @return startTime
  **/
  @Schema(description = "劵码有效的起始时间")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventCodeInfo endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * 劵码有效的终止时间
   * @return endTime
  **/
  @Schema(description = "劵码有效的终止时间")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventCodeInfo confirmTime(Integer confirmTime) {
    this.confirmTime = confirmTime;
    return this;
  }

   /**
   * 核销时间
   * @return confirmTime
  **/
  @Schema(description = "核销时间")
  public Integer getConfirmTime() {
    return confirmTime;
  }

  public void setConfirmTime(Integer confirmTime) {
    this.confirmTime = confirmTime;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventCodeInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * * 劵码的状态   * -1: 不存在   * 1: 未核销   * 2: 已核销 
   * @return status
  **/
  @Schema(description = "* 劵码的状态   * -1: 不存在   * 1: 未核销   * 2: 已核销 ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponCommonGrouponEventCodeInfo codeInfo = (EnterpriseGrouponGrouponCommonGrouponEventCodeInfo) o;
    return Objects.equals(this.grouponId, codeInfo.grouponId) &&
        Objects.equals(this.code, codeInfo.code) &&
        Objects.equals(this.startTime, codeInfo.startTime) &&
        Objects.equals(this.endTime, codeInfo.endTime) &&
        Objects.equals(this.confirmTime, codeInfo.confirmTime) &&
        Objects.equals(this.status, codeInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grouponId, code, startTime, endTime, confirmTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponCommonGrouponEventCodeInfo {\n");
    
    sb.append("    grouponId: ").append(toIndentedString(grouponId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    confirmTime: ").append(toIndentedString(confirmTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
