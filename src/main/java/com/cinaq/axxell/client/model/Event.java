/*
 * axxell-api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.cinaq.axxell.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * An event registered in the system
 */
@ApiModel(description = "An event registered in the system")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-22T21:27:56.094+02:00")
public class Event   {
  @SerializedName("creationTime")
  private String creationTime = null;

  /**
   * Type of event, consumer cannot set recommend
   */
  public enum EventTypeEnum {
    @SerializedName("view")
    VIEW("view"),
    
    @SerializedName("purchase")
    PURCHASE("purchase"),
    
    @SerializedName("recommend")
    RECOMMEND("recommend");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("eventType")
  private EventTypeEnum eventType = null;

  @SerializedName("eventId")
  private String eventId = null;

  @SerializedName("eventTime")
  private String eventTime = null;

  @SerializedName("entityType")
  private String entityType = null;

  @SerializedName("entityId")
  private String entityId = null;

  @SerializedName("targetEntityType")
  private String targetEntityType = null;

  @SerializedName("targetEntityId")
  private String targetEntityId = null;

  @SerializedName("body")
  private String body = null;

  public Event creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Read-only
   * @return creationTime
  **/
  @ApiModelProperty(example = "null", value = "Read-only")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public Event eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Type of event, consumer cannot set recommend
   * @return eventType
  **/
  @ApiModelProperty(example = "null", value = "Type of event, consumer cannot set recommend")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public Event eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Read-only
   * @return eventId
  **/
  @ApiModelProperty(example = "null", value = "Read-only")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public Event eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Read-only
   * @return eventTime
  **/
  @ApiModelProperty(example = "null", value = "Read-only")
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public Event entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Read-only
   * @return entityType
  **/
  @ApiModelProperty(example = "null", value = "Read-only")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public Event entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * The user that triggered this event. You are free to choose whatever you like but it has to be consistent. Good examples are email address, internal user id or sha256 hash of these values.
   * @return entityId
  **/
  @ApiModelProperty(example = "null", value = "The user that triggered this event. You are free to choose whatever you like but it has to be consistent. Good examples are email address, internal user id or sha256 hash of these values.")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public Event targetEntityType(String targetEntityType) {
    this.targetEntityType = targetEntityType;
    return this;
  }

   /**
   * Read-only
   * @return targetEntityType
  **/
  @ApiModelProperty(example = "null", value = "Read-only")
  public String getTargetEntityType() {
    return targetEntityType;
  }

  public void setTargetEntityType(String targetEntityType) {
    this.targetEntityType = targetEntityType;
  }

  public Event targetEntityId(String targetEntityId) {
    this.targetEntityId = targetEntityId;
    return this;
  }

   /**
   * Way to identify your product. Use the product id from your shop
   * @return targetEntityId
  **/
  @ApiModelProperty(example = "null", value = "Way to identify your product. Use the product id from your shop")
  public String getTargetEntityId() {
    return targetEntityId;
  }

  public void setTargetEntityId(String targetEntityId) {
    this.targetEntityId = targetEntityId;
  }

  public Event body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Meta information that doesn't fit into above fields. Read-only
   * @return body
  **/
  @ApiModelProperty(example = "null", value = "Meta information that doesn't fit into above fields. Read-only")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.creationTime, event.creationTime) &&
        Objects.equals(this.eventType, event.eventType) &&
        Objects.equals(this.eventId, event.eventId) &&
        Objects.equals(this.eventTime, event.eventTime) &&
        Objects.equals(this.entityType, event.entityType) &&
        Objects.equals(this.entityId, event.entityId) &&
        Objects.equals(this.targetEntityType, event.targetEntityType) &&
        Objects.equals(this.targetEntityId, event.targetEntityId) &&
        Objects.equals(this.body, event.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, eventType, eventId, eventTime, entityType, entityId, targetEntityType, targetEntityId, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    targetEntityType: ").append(toIndentedString(targetEntityType)).append("\n");
    sb.append("    targetEntityId: ").append(toIndentedString(targetEntityId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

