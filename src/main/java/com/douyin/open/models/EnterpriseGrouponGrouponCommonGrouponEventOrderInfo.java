/*
 * 团购活动事件回调
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
import com.douyin.open.models.EnterpriseGrouponGrouponCommonGrouponEventCodeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseGrouponGrouponCommonGrouponEventOrderInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:13.558916+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseGrouponGrouponCommonGrouponEventOrderInfo {
  @JsonProperty("order_id")
  private String orderId = null;

  @JsonProperty("channel")
  private String channel = null;

  @JsonProperty("buyer_open_id")
  private String buyerOpenId = null;

  @JsonProperty("original_amount")
  private Integer originalAmount = null;

  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("refund_amount")
  private Integer refundAmount = null;

  @JsonProperty("settle_amount")
  private Integer settleAmount = null;

  @JsonProperty("item_count")
  private Integer itemCount = null;

  /**
   * * 订单状态   * 1: 订单完成   * 101: 支付完成   * 200: 发起核销   * 201: 核销完成   * 202: 核销失败   * 299: 用户申请退款   * 300: 商户发起退款   * 301: 退款成功   * 302: 退款失败 
   */
  public enum StatusEnum {
    NUMBER_1(1),
    NUMBER_101(101),
    NUMBER_200(200),
    NUMBER_201(201),
    NUMBER_202(202),
    NUMBER_299(299),
    NUMBER_300(300),
    NUMBER_301(301),
    NUMBER_302(302);

    private Integer value;

    StatusEnum(Integer value) {
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

  @JsonProperty("create_time")
  private Long createTime = null;

  @JsonProperty("pay_time")
  private Long payTime = null;

  @JsonProperty("refund_time")
  private Long refundTime = null;

  @JsonProperty("codes")
  private List<EnterpriseGrouponGrouponCommonGrouponEventCodeInfo> codes = new ArrayList<>();

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * 团购活动订单Id
   * @return orderId
  **/
  @Schema(required = true, description = "团购活动订单Id")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * 订单来源
   * @return channel
  **/
  @Schema(required = true, description = "订单来源")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo buyerOpenId(String buyerOpenId) {
    this.buyerOpenId = buyerOpenId;
    return this;
  }

   /**
   * 买家的open_id
   * @return buyerOpenId
  **/
  @Schema(required = true, description = "买家的open_id")
  public String getBuyerOpenId() {
    return buyerOpenId;
  }

  public void setBuyerOpenId(String buyerOpenId) {
    this.buyerOpenId = buyerOpenId;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo originalAmount(Integer originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * 原价，单位分
   * minimum: 1
   * @return originalAmount
  **/
  @Schema(example = "100", required = true, description = "原价，单位分")
  public Integer getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(Integer originalAmount) {
    this.originalAmount = originalAmount;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * 订单金额，单位分
   * minimum: 1
   * @return amount
  **/
  @Schema(example = "100", required = true, description = "订单金额，单位分")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo refundAmount(Integer refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 退款金额，单位分
   * minimum: 1
   * @return refundAmount
  **/
  @Schema(example = "100", required = true, description = "退款金额，单位分")
  public Integer getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Integer refundAmount) {
    this.refundAmount = refundAmount;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo settleAmount(Integer settleAmount) {
    this.settleAmount = settleAmount;
    return this;
  }

   /**
   * 结算金额，单位分
   * minimum: 1
   * @return settleAmount
  **/
  @Schema(example = "100", required = true, description = "结算金额，单位分")
  public Integer getSettleAmount() {
    return settleAmount;
  }

  public void setSettleAmount(Integer settleAmount) {
    this.settleAmount = settleAmount;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * 团购券个数
   * minimum: 1
   * maximum: 1000
   * @return itemCount
  **/
  @Schema(example = "10", required = true, description = "团购券个数")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * * 订单状态   * 1: 订单完成   * 101: 支付完成   * 200: 发起核销   * 201: 核销完成   * 202: 核销失败   * 299: 用户申请退款   * 300: 商户发起退款   * 301: 退款成功   * 302: 退款失败 
   * @return status
  **/
  @Schema(required = true, description = "* 订单状态   * 1: 订单完成   * 101: 支付完成   * 200: 发起核销   * 201: 核销完成   * 202: 核销失败   * 299: 用户申请退款   * 300: 商户发起退款   * 301: 退款成功   * 302: 退款失败 ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 订单创建时间 unix time
   * @return createTime
  **/
  @Schema(example = "123343214", required = true, description = "订单创建时间 unix time")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo payTime(Long payTime) {
    this.payTime = payTime;
    return this;
  }

   /**
   * 订单支付时间 unix time
   * @return payTime
  **/
  @Schema(example = "123343214", required = true, description = "订单支付时间 unix time")
  public Long getPayTime() {
    return payTime;
  }

  public void setPayTime(Long payTime) {
    this.payTime = payTime;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo refundTime(Long refundTime) {
    this.refundTime = refundTime;
    return this;
  }

   /**
   * 退款完成时间 unix time
   * @return refundTime
  **/
  @Schema(example = "123343214", description = "退款完成时间 unix time")
  public Long getRefundTime() {
    return refundTime;
  }

  public void setRefundTime(Long refundTime) {
    this.refundTime = refundTime;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo codes(List<EnterpriseGrouponGrouponCommonGrouponEventCodeInfo> codes) {
    this.codes = codes;
    return this;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventOrderInfo addCodesItem(EnterpriseGrouponGrouponCommonGrouponEventCodeInfo codesItem) {
    this.codes.add(codesItem);
    return this;
  }

   /**
   * 团购券码列表
   * @return codes
  **/
  @Schema(required = true, description = "团购券码列表")
  public List<EnterpriseGrouponGrouponCommonGrouponEventCodeInfo> getCodes() {
    return codes;
  }

  public void setCodes(List<EnterpriseGrouponGrouponCommonGrouponEventCodeInfo> codes) {
    this.codes = codes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponCommonGrouponEventOrderInfo orderInfo = (EnterpriseGrouponGrouponCommonGrouponEventOrderInfo) o;
    return Objects.equals(this.orderId, orderInfo.orderId) &&
        Objects.equals(this.channel, orderInfo.channel) &&
        Objects.equals(this.buyerOpenId, orderInfo.buyerOpenId) &&
        Objects.equals(this.originalAmount, orderInfo.originalAmount) &&
        Objects.equals(this.amount, orderInfo.amount) &&
        Objects.equals(this.refundAmount, orderInfo.refundAmount) &&
        Objects.equals(this.settleAmount, orderInfo.settleAmount) &&
        Objects.equals(this.itemCount, orderInfo.itemCount) &&
        Objects.equals(this.status, orderInfo.status) &&
        Objects.equals(this.createTime, orderInfo.createTime) &&
        Objects.equals(this.payTime, orderInfo.payTime) &&
        Objects.equals(this.refundTime, orderInfo.refundTime) &&
        Objects.equals(this.codes, orderInfo.codes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, channel, buyerOpenId, originalAmount, amount, refundAmount, settleAmount, itemCount, status, createTime, payTime, refundTime, codes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponCommonGrouponEventOrderInfo {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    buyerOpenId: ").append(toIndentedString(buyerOpenId)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    settleAmount: ").append(toIndentedString(settleAmount)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    payTime: ").append(toIndentedString(payTime)).append("\n");
    sb.append("    refundTime: ").append(toIndentedString(refundTime)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
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
