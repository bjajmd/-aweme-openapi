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
import com.douyin.open.models.DiscoveryEntRankRankAlbum;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * DiscoveryEntRankRankInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:23.248623+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class DiscoveryEntRankRankInlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("active_time")
  private String activeTime = null;

  @JsonProperty("list")
  private List<DiscoveryEntRankRankAlbum> list = null;

  public DiscoveryEntRankRankInlineResponse200Data errorCode(Integer errorCode) {
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

  public DiscoveryEntRankRankInlineResponse200Data description(String description) {
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

  public DiscoveryEntRankRankInlineResponse200Data activeTime(String activeTime) {
    this.activeTime = activeTime;
    return this;
  }

   /**
   * 生成时间
   * @return activeTime
  **/
  @Schema(example = "2020-03-31 12:00:00", description = "生成时间")
  public String getActiveTime() {
    return activeTime;
  }

  public void setActiveTime(String activeTime) {
    this.activeTime = activeTime;
  }

  public DiscoveryEntRankRankInlineResponse200Data list(List<DiscoveryEntRankRankAlbum> list) {
    this.list = list;
    return this;
  }

  public DiscoveryEntRankRankInlineResponse200Data addListItem(DiscoveryEntRankRankAlbum listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * 实时热点词
   * @return list
  **/
  @Schema(description = "实时热点词")
  public List<DiscoveryEntRankRankAlbum> getList() {
    return list;
  }

  public void setList(List<DiscoveryEntRankRankAlbum> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveryEntRankRankInlineResponse200Data inlineResponse200Data = (DiscoveryEntRankRankInlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.activeTime, inlineResponse200Data.activeTime) &&
        Objects.equals(this.list, inlineResponse200Data.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, activeTime, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryEntRankRankInlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
