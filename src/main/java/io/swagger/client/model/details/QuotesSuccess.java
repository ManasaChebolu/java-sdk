package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * QuotesSuccess
 */

public class QuotesSuccess {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("infoID")
  private String infoID = null;

  @SerializedName("data")
  private QuotesSuccessData data = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("status")
  private String status = null;

  public QuotesSuccess code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(example = "200", description = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public QuotesSuccess infoID(String infoID) {
    this.infoID = infoID;
    return this;
  }

   /**
   * Get infoID
   * @return infoID
  **/
  @Schema(example = "0", description = "")
  public String getInfoID() {
    return infoID;
  }

  public void setInfoID(String infoID) {
    this.infoID = infoID;
  }

  public QuotesSuccess data(QuotesSuccessData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public QuotesSuccessData getData() {
    return data;
  }

  public void setData(QuotesSuccessData data) {
    this.data = data;
  }

  public QuotesSuccess timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(example = "05-07-2024 01:03:26", description = "")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public QuotesSuccess status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(example = "success", description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotesSuccess quotesSuccess = (QuotesSuccess) o;
    return Objects.equals(this.code, quotesSuccess.code) &&
        Objects.equals(this.infoID, quotesSuccess.infoID) &&
        Objects.equals(this.data, quotesSuccess.data) &&
        Objects.equals(this.timestamp, quotesSuccess.timestamp) &&
        Objects.equals(this.status, quotesSuccess.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, infoID, data, timestamp, status);
  }


  @Override
  public String toString() {

      return "class QuotesSuccess {\n" +
              "    code: " + toIndentedString(code) + "\n" +
              "    infoID: " + toIndentedString(infoID) + "\n" +
              "    data: " + toIndentedString(data) + "\n" +
              "    timestamp: " + toIndentedString(timestamp) + "\n" +
              "    status: " + toIndentedString(status) + "\n" +
              "}";
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
