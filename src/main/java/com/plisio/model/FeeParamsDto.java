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
 * FeeParamsDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-04T15:20:38.886999298+03:00[Europe/Moscow]")

public class FeeParamsDto {
  @JsonProperty("conf_target")
  private String confTarget = null;

  @JsonProperty("plan")
  private String plan = null;

  @JsonProperty("value")
  private String value = null;

  public FeeParamsDto confTarget(String confTarget) {
    this.confTarget = confTarget;
    return this;
  }

   /**
   * estimated fee parameter to confirm the transaction in the “conf_target” blocks
   * @return confTarget
  **/
  @Schema(description = "estimated fee parameter to confirm the transaction in the “conf_target” blocks")
  public String getConfTarget() {
    return confTarget;
  }

  public void setConfTarget(String confTarget) {
    this.confTarget = confTarget;
  }

  public FeeParamsDto plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * the Plisio’s fee plan name
   * @return plan
  **/
  @Schema(description = "the Plisio’s fee plan name")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public FeeParamsDto value(String value) {
    this.value = value;
    return this;
  }

   /**
   * fee value
   * @return value
  **/
  @Schema(description = "fee value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeParamsDto feeParamsDto = (FeeParamsDto) o;
    return Objects.equals(this.confTarget, feeParamsDto.confTarget) &&
        Objects.equals(this.plan, feeParamsDto.plan) &&
        Objects.equals(this.value, feeParamsDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confTarget, plan, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeParamsDto {\n");
    
    sb.append("    confTarget: ").append(toIndentedString(confTarget)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
