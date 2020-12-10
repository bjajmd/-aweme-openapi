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
import java.util.ArrayList;
import java.util.List;
/**
 * ImageCreateImageCreateBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:50.245158+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ImageCreateImageCreateBody1 {
  @JsonProperty("image_id")
  private String imageId = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("poi_id")
  private String poiId = null;

  @JsonProperty("poi_name")
  private String poiName = null;

  @JsonProperty("micro_app_id")
  private String microAppId = null;

  @JsonProperty("micro_app_title")
  private String microAppTitle = null;

  @JsonProperty("micro_app_url")
  private String microAppUrl = null;

  @JsonProperty("at_users")
  private List<String> atUsers = null;

  public ImageCreateImageCreateBody1 imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * 通过/image/upload/接口得到。
   * @return imageId
  **/
  @Schema(example = "v0201f510000smhdsr0ggl1v4a2b2ps1", required = true, description = "通过/image/upload/接口得到。")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ImageCreateImageCreateBody1 text(String text) {
    this.text = text;
    return this;
  }

   /**
   * 标题，可以带话题。 如title1#话题1 #话题2 注意：话题审核依旧遵循抖音的审核逻辑，强烈建议第三方谨慎拟定话题名称，避免强导流行为。 
   * @return text
  **/
  @Schema(example = "title1#话题1 #话题2 @nickname1", description = "标题，可以带话题。 如title1#话题1 #话题2 注意：话题审核依旧遵循抖音的审核逻辑，强烈建议第三方谨慎拟定话题名称，避免强导流行为。 ")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ImageCreateImageCreateBody1 poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * 地理位置id
   * @return poiId
  **/
  @Schema(description = "地理位置id")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public ImageCreateImageCreateBody1 poiName(String poiName) {
    this.poiName = poiName;
    return this;
  }

   /**
   * 地理位置名称
   * @return poiName
  **/
  @Schema(description = "地理位置名称")
  public String getPoiName() {
    return poiName;
  }

  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }

  public ImageCreateImageCreateBody1 microAppId(String microAppId) {
    this.microAppId = microAppId;
    return this;
  }

   /**
   * 小程序id
   * @return microAppId
  **/
  @Schema(example = "ttef9b112671b152ba", description = "小程序id")
  public String getMicroAppId() {
    return microAppId;
  }

  public void setMicroAppId(String microAppId) {
    this.microAppId = microAppId;
  }

  public ImageCreateImageCreateBody1 microAppTitle(String microAppTitle) {
    this.microAppTitle = microAppTitle;
    return this;
  }

   /**
   * 小程序标题
   * @return microAppTitle
  **/
  @Schema(example = "小程序标题", description = "小程序标题")
  public String getMicroAppTitle() {
    return microAppTitle;
  }

  public void setMicroAppTitle(String microAppTitle) {
    this.microAppTitle = microAppTitle;
  }

  public ImageCreateImageCreateBody1 microAppUrl(String microAppUrl) {
    this.microAppUrl = microAppUrl;
    return this;
  }

   /**
   * 吊起小程序时的参数
   * @return microAppUrl
  **/
  @Schema(description = "吊起小程序时的参数")
  public String getMicroAppUrl() {
    return microAppUrl;
  }

  public void setMicroAppUrl(String microAppUrl) {
    this.microAppUrl = microAppUrl;
  }

  public ImageCreateImageCreateBody1 atUsers(List<String> atUsers) {
    this.atUsers = atUsers;
    return this;
  }

  public ImageCreateImageCreateBody1 addAtUsersItem(String atUsersItem) {
    if (this.atUsers == null) {
      this.atUsers = new ArrayList<>();
    }
    this.atUsers.add(atUsersItem);
    return this;
  }

   /**
   * 如果需要at其他用户。将text中@nickname对应的open_id放到这里。
   * @return atUsers
  **/
  @Schema(description = "如果需要at其他用户。将text中@nickname对应的open_id放到这里。")
  public List<String> getAtUsers() {
    return atUsers;
  }

  public void setAtUsers(List<String> atUsers) {
    this.atUsers = atUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageCreateImageCreateBody1 body1 = (ImageCreateImageCreateBody1) o;
    return Objects.equals(this.imageId, body1.imageId) &&
        Objects.equals(this.text, body1.text) &&
        Objects.equals(this.poiId, body1.poiId) &&
        Objects.equals(this.poiName, body1.poiName) &&
        Objects.equals(this.microAppId, body1.microAppId) &&
        Objects.equals(this.microAppTitle, body1.microAppTitle) &&
        Objects.equals(this.microAppUrl, body1.microAppUrl) &&
        Objects.equals(this.atUsers, body1.atUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, text, poiId, poiName, microAppId, microAppTitle, microAppUrl, atUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageCreateImageCreateBody1 {\n");
    
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    microAppId: ").append(toIndentedString(microAppId)).append("\n");
    sb.append("    microAppTitle: ").append(toIndentedString(microAppTitle)).append("\n");
    sb.append("    microAppUrl: ").append(toIndentedString(microAppUrl)).append("\n");
    sb.append("    atUsers: ").append(toIndentedString(atUsers)).append("\n");
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
