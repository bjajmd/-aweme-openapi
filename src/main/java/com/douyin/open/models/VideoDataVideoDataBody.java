/*
 * 
 * 通过抖音视频id批量获取已分享视频数据信息
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
 * VideoDataVideoDataBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:04:03.397067+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class VideoDataVideoDataBody {
  @JsonProperty("item_ids")
  private List<String> itemIds = new ArrayList<>();

  public VideoDataVideoDataBody itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public VideoDataVideoDataBody addItemIdsItem(String itemIdsItem) {
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * item_id数组，仅能查询access_token对应用户上传的视频
   * @return itemIds
  **/
  @Schema(required = true, description = "item_id数组，仅能查询access_token对应用户上传的视频")
  public List<String> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoDataVideoDataBody body = (VideoDataVideoDataBody) o;
    return Objects.equals(this.itemIds, body.itemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoDataVideoDataBody {\n");
    
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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
