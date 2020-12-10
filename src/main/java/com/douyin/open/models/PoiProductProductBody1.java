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
import com.douyin.open.models.PoiProductProductPoiskusyncSkus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * PoiProductProductBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiProductProductBody1 {
  @JsonProperty("spu_ext_id")
  private String spuExtId = null;

  @JsonProperty("skus")
  private List<PoiProductProductPoiskusyncSkus> skus = new ArrayList<>();

  public PoiProductProductBody1 spuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
    return this;
  }

   /**
   * 外部平台SPU ID
   * @return spuExtId
  **/
  @Schema(example = "y0001", required = true, description = "外部平台SPU ID")
  public String getSpuExtId() {
    return spuExtId;
  }

  public void setSpuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
  }

  public PoiProductProductBody1 skus(List<PoiProductProductPoiskusyncSkus> skus) {
    this.skus = skus;
    return this;
  }

  public PoiProductProductBody1 addSkusItem(PoiProductProductPoiskusyncSkus skusItem) {
    this.skus.add(skusItem);
    return this;
  }

   /**
   * Get skus
   * @return skus
  **/
  @Schema(required = true, description = "")
  public List<PoiProductProductPoiskusyncSkus> getSkus() {
    return skus;
  }

  public void setSkus(List<PoiProductProductPoiskusyncSkus> skus) {
    this.skus = skus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductBody1 body1 = (PoiProductProductBody1) o;
    return Objects.equals(this.spuExtId, body1.spuExtId) &&
        Objects.equals(this.skus, body1.skus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spuExtId, skus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductBody1 {\n");
    
    sb.append("    spuExtId: ").append(toIndentedString(spuExtId)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
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
