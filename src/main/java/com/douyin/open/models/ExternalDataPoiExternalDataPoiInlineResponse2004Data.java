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
import com.douyin.open.models.ExternalDataPoiExternalDataPoiInlineResponse2004DataList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ExternalDataPoiExternalDataPoiInlineResponse2004Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:15.723137+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataPoiExternalDataPoiInlineResponse2004Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("list")
  private List<ExternalDataPoiExternalDataPoiInlineResponse2004DataList> list = null;

  @JsonProperty("cursor")
  private Long cursor = null;

  @JsonProperty("has_more")
  private Boolean hasMore = null;

  @JsonProperty("total")
  private Integer total = null;

  public ExternalDataPoiExternalDataPoiInlineResponse2004Data errorCode(Integer errorCode) {
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

  public ExternalDataPoiExternalDataPoiInlineResponse2004Data description(String description) {
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

  public ExternalDataPoiExternalDataPoiInlineResponse2004Data list(List<ExternalDataPoiExternalDataPoiInlineResponse2004DataList> list) {
    this.list = list;
    return this;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2004Data addListItem(ExternalDataPoiExternalDataPoiInlineResponse2004DataList listItem) {
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
  public List<ExternalDataPoiExternalDataPoiInlineResponse2004DataList> getList() {
    return list;
  }

  public void setList(List<ExternalDataPoiExternalDataPoiInlineResponse2004DataList> list) {
    this.list = list;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2004Data cursor(Long cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @Schema(description = "")
  public Long getCursor() {
    return cursor;
  }

  public void setCursor(Long cursor) {
    this.cursor = cursor;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2004Data hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @Schema(description = "")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2004Data total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * ??????
   * @return total
  **/
  @Schema(description = "??????")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataPoiExternalDataPoiInlineResponse2004Data inlineResponse2004Data = (ExternalDataPoiExternalDataPoiInlineResponse2004Data) o;
    return Objects.equals(this.errorCode, inlineResponse2004Data.errorCode) &&
        Objects.equals(this.description, inlineResponse2004Data.description) &&
        Objects.equals(this.list, inlineResponse2004Data.list) &&
        Objects.equals(this.cursor, inlineResponse2004Data.cursor) &&
        Objects.equals(this.hasMore, inlineResponse2004Data.hasMore) &&
        Objects.equals(this.total, inlineResponse2004Data.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, list, cursor, hasMore, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataPoiExternalDataPoiInlineResponse2004Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
