/*
 * 创建动态消息卡片
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
import com.douyin.open.models.EnterpriseImFancyCardCardSaveCardTemplate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseImFancyCardCardSaveFancyCard
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:10:06.392159+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseImFancyCardCardSaveFancyCard {
  @JsonProperty("card_id")
  private String cardId = null;

  @JsonProperty("templates")
  private List<EnterpriseImFancyCardCardSaveCardTemplate> templates = new ArrayList<>();

  /**
   * 审核状态（avaliable可使用,review审核中,reject审核不通过)
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    REVIEW("review"),
    REJECT("reject");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("reject_reason")
  private String rejectReason = null;

  public EnterpriseImFancyCardCardSaveFancyCard cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * 模版名称
   * @return cardId
  **/
  @Schema(example = "default", description = "模版名称")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public EnterpriseImFancyCardCardSaveFancyCard templates(List<EnterpriseImFancyCardCardSaveCardTemplate> templates) {
    this.templates = templates;
    return this;
  }

  public EnterpriseImFancyCardCardSaveFancyCard addTemplatesItem(EnterpriseImFancyCardCardSaveCardTemplate templatesItem) {
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @Schema(required = true, description = "")
  public List<EnterpriseImFancyCardCardSaveCardTemplate> getTemplates() {
    return templates;
  }

  public void setTemplates(List<EnterpriseImFancyCardCardSaveCardTemplate> templates) {
    this.templates = templates;
  }

  public EnterpriseImFancyCardCardSaveFancyCard status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * 审核状态（avaliable可使用,review审核中,reject审核不通过)
   * @return status
  **/
  @Schema(description = "审核状态（avaliable可使用,review审核中,reject审核不通过)")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public EnterpriseImFancyCardCardSaveFancyCard rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 审核不通过原因
   * @return rejectReason
  **/
  @Schema(description = "审核不通过原因")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseImFancyCardCardSaveFancyCard fancyCard = (EnterpriseImFancyCardCardSaveFancyCard) o;
    return Objects.equals(this.cardId, fancyCard.cardId) &&
        Objects.equals(this.templates, fancyCard.templates) &&
        Objects.equals(this.status, fancyCard.status) &&
        Objects.equals(this.rejectReason, fancyCard.rejectReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, templates, status, rejectReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseImFancyCardCardSaveFancyCard {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
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
