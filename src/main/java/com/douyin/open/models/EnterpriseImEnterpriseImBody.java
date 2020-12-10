/*
 * 企业号发送消息
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
 * EnterpriseImEnterpriseImBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:19.609979+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseImEnterpriseImBody {
  @JsonProperty("to_user_id")
  private String toUserId = null;

  @JsonProperty("message_type")
  private String messageType = null;

  @JsonProperty("persona_id")
  private String personaId = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("client_msg_id")
  private String clientMsgId = null;

  public EnterpriseImEnterpriseImBody toUserId(String toUserId) {
    this.toUserId = toUserId;
    return this;
  }

   /**
   * 消息的接收方openid
   * @return toUserId
  **/
  @Schema(example = "0da22181-d833-447f-995f-1beefea5bef3", required = true, description = "消息的接收方openid")
  public String getToUserId() {
    return toUserId;
  }

  public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
  }

  public EnterpriseImEnterpriseImBody messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * 消息内容格式:   * &#x60;text&#x60; - 文本消息   * &#x60;image&#x60; - 图片消息   * &#x60;video&#x60; - 视频消息   * &#x60;card&#x60; - 卡片消息 
   * @return messageType
  **/
  @Schema(example = "text", required = true, description = "消息内容格式:   * `text` - 文本消息   * `image` - 图片消息   * `video` - 视频消息   * `card` - 卡片消息 ")
  public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public EnterpriseImEnterpriseImBody personaId(String personaId) {
    this.personaId = personaId;
    return this;
  }

   /**
   * 客服id，传则走客服会话，否则为普通会话
   * @return personaId
  **/
  @Schema(description = "客服id，传则走客服会话，否则为普通会话")
  public String getPersonaId() {
    return personaId;
  }

  public void setPersonaId(String personaId) {
    this.personaId = personaId;
  }

  public EnterpriseImEnterpriseImBody content(String content) {
    this.content = content;
    return this;
  }

   /**
   * 消息体见下方schema
   * @return content
  **/
  @Schema(example = "{\"text\": \"文本内容\"}", required = true, description = "消息体见下方schema")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public EnterpriseImEnterpriseImBody clientMsgId(String clientMsgId) {
    this.clientMsgId = clientMsgId;
    return this;
  }

   /**
   * 内部使用
   * @return clientMsgId
  **/
  @Schema(description = "内部使用")
  public String getClientMsgId() {
    return clientMsgId;
  }

  public void setClientMsgId(String clientMsgId) {
    this.clientMsgId = clientMsgId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseImEnterpriseImBody body = (EnterpriseImEnterpriseImBody) o;
    return Objects.equals(this.toUserId, body.toUserId) &&
        Objects.equals(this.messageType, body.messageType) &&
        Objects.equals(this.personaId, body.personaId) &&
        Objects.equals(this.content, body.content) &&
        Objects.equals(this.clientMsgId, body.clientMsgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toUserId, messageType, personaId, content, clientMsgId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseImEnterpriseImBody {\n");
    
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    personaId: ").append(toIndentedString(personaId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    clientMsgId: ").append(toIndentedString(clientMsgId)).append("\n");
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
