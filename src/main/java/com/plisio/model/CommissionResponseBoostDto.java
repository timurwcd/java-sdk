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
import com.plisio.model.CommissionResponseSimpleDto;
import com.plisio.model.CommissionResponseSimpleErrorDto;
import com.plisio.model.FeePlanCustomDto;
import com.plisio.model.FeeSimplePlanDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
/**
 * CommissionResponseBoostDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-04T15:20:38.886999298+03:00[Europe/Moscow]")

public class CommissionResponseBoostDto extends CommissionResponseSimpleDto {
  @JsonProperty("minFeeRate")
  private Float minFeeRate = null;

  @JsonProperty("maxFeeRate")
  private Float maxFeeRate = null;

  public CommissionResponseBoostDto minFeeRate(Float minFeeRate) {
    this.minFeeRate = minFeeRate;
    return this;
  }

   /**
   * Minimal fee rate for boost
   * @return minFeeRate
  **/
  @Schema(description = "Minimal fee rate for boost")
  public Float getMinFeeRate() {
    return minFeeRate;
  }

  public void setMinFeeRate(Float minFeeRate) {
    this.minFeeRate = minFeeRate;
  }

  public CommissionResponseBoostDto maxFeeRate(Float maxFeeRate) {
    this.maxFeeRate = maxFeeRate;
    return this;
  }

   /**
   * Maximum fee rate for boost
   * @return maxFeeRate
  **/
  @Schema(description = "Maximum fee rate for boost")
  public Float getMaxFeeRate() {
    return maxFeeRate;
  }

  public void setMaxFeeRate(Float maxFeeRate) {
    this.maxFeeRate = maxFeeRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommissionResponseBoostDto commissionResponseBoostDto = (CommissionResponseBoostDto) o;
    return Objects.equals(this.minFeeRate, commissionResponseBoostDto.minFeeRate) &&
        Objects.equals(this.maxFeeRate, commissionResponseBoostDto.maxFeeRate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minFeeRate, maxFeeRate, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionResponseBoostDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    minFeeRate: ").append(toIndentedString(minFeeRate)).append("\n");
    sb.append("    maxFeeRate: ").append(toIndentedString(maxFeeRate)).append("\n");
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
