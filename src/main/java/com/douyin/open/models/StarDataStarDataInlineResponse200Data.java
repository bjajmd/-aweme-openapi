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
import com.douyin.open.models.StarDataStarDataInlineResponse200DataList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * StarDataStarDataInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:10.297280+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class StarDataStarDataInlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("hot_list_update_timestamp")
  private Integer hotListUpdateTimestamp = null;

  @JsonProperty("hot_list_type")
  private Integer hotListType = null;

  @JsonProperty("hot_list_description")
  private String hotListDescription = null;

  @JsonProperty("list")
  private List<StarDataStarDataInlineResponse200DataList> list = null;

  public StarDataStarDataInlineResponse200Data errorCode(Integer errorCode) {
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

  public StarDataStarDataInlineResponse200Data description(String description) {
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

  public StarDataStarDataInlineResponse200Data hotListUpdateTimestamp(Integer hotListUpdateTimestamp) {
    this.hotListUpdateTimestamp = hotListUpdateTimestamp;
    return this;
  }

   /**
   * 达人热榜更新时间戳
   * @return hotListUpdateTimestamp
  **/
  @Schema(example = "1584418477", description = "达人热榜更新时间戳")
  public Integer getHotListUpdateTimestamp() {
    return hotListUpdateTimestamp;
  }

  public void setHotListUpdateTimestamp(Integer hotListUpdateTimestamp) {
    this.hotListUpdateTimestamp = hotListUpdateTimestamp;
  }

  public StarDataStarDataInlineResponse200Data hotListType(Integer hotListType) {
    this.hotListType = hotListType;
    return this;
  }

   /**
   * 达人热榜类型
   * @return hotListType
  **/
  @Schema(example = "1", description = "达人热榜类型")
  public Integer getHotListType() {
    return hotListType;
  }

  public void setHotListType(Integer hotListType) {
    this.hotListType = hotListType;
  }

  public StarDataStarDataInlineResponse200Data hotListDescription(String hotListDescription) {
    this.hotListDescription = hotListDescription;
    return this;
  }

   /**
   * 热榜类型说明
   * @return hotListDescription
  **/
  @Schema(example = "【筛选规则】：综合评估创作者近期作品的有效视频数据、性价比、信用分、有效涨粉、种草指数等加权取值进行排序，以内容数据为主要衡量标准。【达人优势】：综合能力高，具有较大的商业价值。【适用场景】：适用于大部分营销场景，可作为各领域商业投放的必选名单。", description = "热榜类型说明")
  public String getHotListDescription() {
    return hotListDescription;
  }

  public void setHotListDescription(String hotListDescription) {
    this.hotListDescription = hotListDescription;
  }

  public StarDataStarDataInlineResponse200Data list(List<StarDataStarDataInlineResponse200DataList> list) {
    this.list = list;
    return this;
  }

  public StarDataStarDataInlineResponse200Data addListItem(StarDataStarDataInlineResponse200DataList listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @Schema(description = "")
  public List<StarDataStarDataInlineResponse200DataList> getList() {
    return list;
  }

  public void setList(List<StarDataStarDataInlineResponse200DataList> list) {
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
    StarDataStarDataInlineResponse200Data inlineResponse200Data = (StarDataStarDataInlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.hotListUpdateTimestamp, inlineResponse200Data.hotListUpdateTimestamp) &&
        Objects.equals(this.hotListType, inlineResponse200Data.hotListType) &&
        Objects.equals(this.hotListDescription, inlineResponse200Data.hotListDescription) &&
        Objects.equals(this.list, inlineResponse200Data.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, hotListUpdateTimestamp, hotListType, hotListDescription, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDataStarDataInlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hotListUpdateTimestamp: ").append(toIndentedString(hotListUpdateTimestamp)).append("\n");
    sb.append("    hotListType: ").append(toIndentedString(hotListType)).append("\n");
    sb.append("    hotListDescription: ").append(toIndentedString(hotListDescription)).append("\n");
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
