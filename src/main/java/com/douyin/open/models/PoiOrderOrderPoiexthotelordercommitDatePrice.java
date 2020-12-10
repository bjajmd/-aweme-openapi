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
 * PoiOrderOrderPoiexthotelordercommitDatePrice
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:06.711814+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiOrderOrderPoiexthotelordercommitDatePrice {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("date_price")
  private Integer datePrice = null;

  public PoiOrderOrderPoiexthotelordercommitDatePrice date(String date) {
    this.date = date;
    return this;
  }

   /**
   * 入住日期 yyyyMMdd
   * @return date
  **/
  @Schema(required = true, description = "入住日期 yyyyMMdd")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PoiOrderOrderPoiexthotelordercommitDatePrice datePrice(Integer datePrice) {
    this.datePrice = datePrice;
    return this;
  }

   /**
   * 入住日价格, 人民币分
   * @return datePrice
  **/
  @Schema(required = true, description = "入住日价格, 人民币分")
  public Integer getDatePrice() {
    return datePrice;
  }

  public void setDatePrice(Integer datePrice) {
    this.datePrice = datePrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiOrderOrderPoiexthotelordercommitDatePrice poiexthotelordercommitDatePrice = (PoiOrderOrderPoiexthotelordercommitDatePrice) o;
    return Objects.equals(this.date, poiexthotelordercommitDatePrice.date) &&
        Objects.equals(this.datePrice, poiexthotelordercommitDatePrice.datePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, datePrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiOrderOrderPoiexthotelordercommitDatePrice {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    datePrice: ").append(toIndentedString(datePrice)).append("\n");
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
