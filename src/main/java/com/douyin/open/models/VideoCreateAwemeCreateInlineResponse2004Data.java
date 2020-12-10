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
import com.douyin.open.models.VideoCreateAwemeCreateInlineResponse2004DataVideo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * VideoCreateAwemeCreateInlineResponse2004Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-19T14:21:48.922886+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class VideoCreateAwemeCreateInlineResponse2004Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("video")
  private VideoCreateAwemeCreateInlineResponse2004DataVideo video = null;

  public VideoCreateAwemeCreateInlineResponse2004Data errorCode(Integer errorCode) {
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

  public VideoCreateAwemeCreateInlineResponse2004Data description(String description) {
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

  public VideoCreateAwemeCreateInlineResponse2004Data video(VideoCreateAwemeCreateInlineResponse2004DataVideo video) {
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @Schema(description = "")
  public VideoCreateAwemeCreateInlineResponse2004DataVideo getVideo() {
    return video;
  }

  public void setVideo(VideoCreateAwemeCreateInlineResponse2004DataVideo video) {
    this.video = video;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoCreateAwemeCreateInlineResponse2004Data inlineResponse2004Data = (VideoCreateAwemeCreateInlineResponse2004Data) o;
    return Objects.equals(this.errorCode, inlineResponse2004Data.errorCode) &&
        Objects.equals(this.description, inlineResponse2004Data.description) &&
        Objects.equals(this.video, inlineResponse2004Data.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, video);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCreateAwemeCreateInlineResponse2004Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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
