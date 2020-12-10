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
import com.douyin.open.models.VideoCommentVideoCommentExtraBody;
import com.douyin.open.models.VideoCommentVideoCommentInlineResponse200DataList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * VideoCommentVideoCommentInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:12.559217+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class VideoCommentVideoCommentInlineResponse200Data {
  @JsonProperty("extra")
  private VideoCommentVideoCommentExtraBody extra = null;

  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("cursor")
  private Long cursor = null;

  @JsonProperty("has_more")
  private Boolean hasMore = null;

  @JsonProperty("list")
  private List<VideoCommentVideoCommentInlineResponse200DataList> list = new ArrayList<>();

  public VideoCommentVideoCommentInlineResponse200Data extra(VideoCommentVideoCommentExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public VideoCommentVideoCommentExtraBody getExtra() {
    return extra;
  }

  public void setExtra(VideoCommentVideoCommentExtraBody extra) {
    this.extra = extra;
  }

  public VideoCommentVideoCommentInlineResponse200Data errorCode(Integer errorCode) {
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

  public VideoCommentVideoCommentInlineResponse200Data description(String description) {
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

  public VideoCommentVideoCommentInlineResponse200Data cursor(Long cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @Schema(required = true, description = "")
  public Long getCursor() {
    return cursor;
  }

  public void setCursor(Long cursor) {
    this.cursor = cursor;
  }

  public VideoCommentVideoCommentInlineResponse200Data hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @Schema(required = true, description = "")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public VideoCommentVideoCommentInlineResponse200Data list(List<VideoCommentVideoCommentInlineResponse200DataList> list) {
    this.list = list;
    return this;
  }

  public VideoCommentVideoCommentInlineResponse200Data addListItem(VideoCommentVideoCommentInlineResponse200DataList listItem) {
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @Schema(required = true, description = "")
  public List<VideoCommentVideoCommentInlineResponse200DataList> getList() {
    return list;
  }

  public void setList(List<VideoCommentVideoCommentInlineResponse200DataList> list) {
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
    VideoCommentVideoCommentInlineResponse200Data inlineResponse200Data = (VideoCommentVideoCommentInlineResponse200Data) o;
    return Objects.equals(this.extra, inlineResponse200Data.extra) &&
        Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.cursor, inlineResponse200Data.cursor) &&
        Objects.equals(this.hasMore, inlineResponse200Data.hasMore) &&
        Objects.equals(this.list, inlineResponse200Data.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, errorCode, description, cursor, hasMore, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCommentVideoCommentInlineResponse200Data {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
