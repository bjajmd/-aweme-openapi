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
 * HotsearchHotsearchHotSentence
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:02.676044+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class HotsearchHotsearchHotSentence {
  @JsonProperty("hot_level")
  private Integer hotLevel = null;

  @JsonProperty("sentence")
  private String sentence = null;

  public HotsearchHotsearchHotSentence hotLevel(Integer hotLevel) {
    this.hotLevel = hotLevel;
    return this;
  }

   /**
   * 热度 综合点赞、评论、转发等计算得出
   * @return hotLevel
  **/
  @Schema(example = "2998000", required = true, description = "热度 综合点赞、评论、转发等计算得出")
  public Integer getHotLevel() {
    return hotLevel;
  }

  public void setHotLevel(Integer hotLevel) {
    this.hotLevel = hotLevel;
  }

  public HotsearchHotsearchHotSentence sentence(String sentence) {
    this.sentence = sentence;
    return this;
  }

   /**
   * 热点词
   * @return sentence
  **/
  @Schema(example = "苹果发布AirPods Pro", required = true, description = "热点词")
  public String getSentence() {
    return sentence;
  }

  public void setSentence(String sentence) {
    this.sentence = sentence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotsearchHotsearchHotSentence hotSentence = (HotsearchHotsearchHotSentence) o;
    return Objects.equals(this.hotLevel, hotSentence.hotLevel) &&
        Objects.equals(this.sentence, hotSentence.sentence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotLevel, sentence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotsearchHotsearchHotSentence {\n");
    
    sb.append("    hotLevel: ").append(toIndentedString(hotLevel)).append("\n");
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
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
