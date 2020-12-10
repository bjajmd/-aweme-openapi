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
 * HotsearchHotsearchTrendingSentence
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:02.676044+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class HotsearchHotsearchTrendingSentence {
  @JsonProperty("sentence")
  private String sentence = null;

  @JsonProperty("hot_level")
  private Integer hotLevel = null;

  /**
   * 标签:   * &#x60;0&#x60; - 无   * &#x60;1&#x60; - 新   * &#x60;2&#x60; - 推荐   * &#x60;3&#x60; - 热   * &#x60;4&#x60; - 爆   * &#x60;5&#x60; - 首发 
   */
  public enum LabelEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4),
    NUMBER_5(5);

    private Integer value;

    LabelEnum(Integer value) {
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
    public static LabelEnum fromValue(String text) {
      for (LabelEnum b : LabelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("label")
  private LabelEnum label = null;

  public HotsearchHotsearchTrendingSentence sentence(String sentence) {
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

  public HotsearchHotsearchTrendingSentence hotLevel(Integer hotLevel) {
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

  public HotsearchHotsearchTrendingSentence label(LabelEnum label) {
    this.label = label;
    return this;
  }

   /**
   * 标签:   * &#x60;0&#x60; - 无   * &#x60;1&#x60; - 新   * &#x60;2&#x60; - 推荐   * &#x60;3&#x60; - 热   * &#x60;4&#x60; - 爆   * &#x60;5&#x60; - 首发 
   * @return label
  **/
  @Schema(required = true, description = "标签:   * `0` - 无   * `1` - 新   * `2` - 推荐   * `3` - 热   * `4` - 爆   * `5` - 首发 ")
  public LabelEnum getLabel() {
    return label;
  }

  public void setLabel(LabelEnum label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotsearchHotsearchTrendingSentence trendingSentence = (HotsearchHotsearchTrendingSentence) o;
    return Objects.equals(this.sentence, trendingSentence.sentence) &&
        Objects.equals(this.hotLevel, trendingSentence.hotLevel) &&
        Objects.equals(this.label, trendingSentence.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentence, hotLevel, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotsearchHotsearchTrendingSentence {\n");
    
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
    sb.append("    hotLevel: ").append(toIndentedString(hotLevel)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
