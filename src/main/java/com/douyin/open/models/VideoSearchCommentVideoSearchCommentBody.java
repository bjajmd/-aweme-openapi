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
 * VideoSearchCommentVideoSearchCommentBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:33.306577+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class VideoSearchCommentVideoSearchCommentBody {
  @JsonProperty("sec_item_id")
  private String secItemId = null;

  @JsonProperty("comment_id")
  private String commentId = null;

  @JsonProperty("content")
  private String content = null;

  public VideoSearchCommentVideoSearchCommentBody secItemId(String secItemId) {
    this.secItemId = secItemId;
    return this;
  }

   /**
   * 视频搜索接口返回的加密的视频id
   * @return secItemId
  **/
  @Schema(required = true, description = "视频搜索接口返回的加密的视频id")
  public String getSecItemId() {
    return secItemId;
  }

  public void setSecItemId(String secItemId) {
    this.secItemId = secItemId;
  }

  public VideoSearchCommentVideoSearchCommentBody commentId(String commentId) {
    this.commentId = commentId;
    return this;
  }

   /**
   * 需要回复的评论id（如果需要回复的是视频不传此字段）
   * @return commentId
  **/
  @Schema(description = "需要回复的评论id（如果需要回复的是视频不传此字段）")
  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  public VideoSearchCommentVideoSearchCommentBody content(String content) {
    this.content = content;
    return this;
  }

   /**
   * 评论内容
   * @return content
  **/
  @Schema(required = true, description = "评论内容")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoSearchCommentVideoSearchCommentBody body = (VideoSearchCommentVideoSearchCommentBody) o;
    return Objects.equals(this.secItemId, body.secItemId) &&
        Objects.equals(this.commentId, body.commentId) &&
        Objects.equals(this.content, body.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secItemId, commentId, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoSearchCommentVideoSearchCommentBody {\n");
    
    sb.append("    secItemId: ").append(toIndentedString(secItemId)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
