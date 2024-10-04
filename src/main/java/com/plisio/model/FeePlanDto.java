/*
 * Plisio API
 * Plisio payment gateway API
 *
 * OpenAPI spec version: 1.0
 * Contact: lead@plisio.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.plisio.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * FeePlanDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-04T15:20:38.886999298+03:00[Europe/Moscow]")

public class FeePlanDto {
  @JsonProperty("economy")
  private Object economy = null;

  @JsonProperty("normal")
  private Object normal = null;

  @JsonProperty("priority")
  private Object priority = null;

  public FeePlanDto economy(Object economy) {
    this.economy = economy;
    return this;
  }

   /**
   * estimated fee parameter to confirm the transaction in the “conf_target” blocks
   * @return economy
  **/
  @Schema(description = "estimated fee parameter to confirm the transaction in the “conf_target” blocks")
  public Object getEconomy() {
    return economy;
  }

  public void setEconomy(Object economy) {
    this.economy = economy;
  }

  public FeePlanDto normal(Object normal) {
    this.normal = normal;
    return this;
  }

   /**
   * estimated fee parameter to confirm the transaction in the “conf_target” blocks
   * @return normal
  **/
  @Schema(description = "estimated fee parameter to confirm the transaction in the “conf_target” blocks")
  public Object getNormal() {
    return normal;
  }

  public void setNormal(Object normal) {
    this.normal = normal;
  }

  public FeePlanDto priority(Object priority) {
    this.priority = priority;
    return this;
  }

   /**
   * estimated fee parameter to confirm the transaction in the “conf_target” blocks
   * @return priority
  **/
  @Schema(description = "estimated fee parameter to confirm the transaction in the “conf_target” blocks")
  public Object getPriority() {
    return priority;
  }

  public void setPriority(Object priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeePlanDto feePlanDto = (FeePlanDto) o;
    return Objects.equals(this.economy, feePlanDto.economy) &&
        Objects.equals(this.normal, feePlanDto.normal) &&
        Objects.equals(this.priority, feePlanDto.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(economy, normal, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeePlanDto {\n");
    
    sb.append("    economy: ").append(toIndentedString(economy)).append("\n");
    sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
