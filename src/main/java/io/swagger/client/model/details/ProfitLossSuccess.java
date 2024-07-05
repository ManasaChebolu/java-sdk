package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ProfitLossSuccess
 */

public class ProfitLossSuccess {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("infoID")
  private String infoID = null;

  @SerializedName("data")
  private ProfitLossSuccessData data = null;

  @SerializedName("infoMsg")
  private String infoMsg = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("status")
  private String status = null;

  public ProfitLossSuccess code(Integer code) {
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

  public ProfitLossSuccess infoID(String infoID) {
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

  public ProfitLossSuccess data(ProfitLossSuccessData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public ProfitLossSuccessData getData() {
    return data;
  }

  public void setData(ProfitLossSuccessData data) {
    this.data = data;
  }

  public ProfitLossSuccess infoMsg(String infoMsg) {
    this.infoMsg = infoMsg;
    return this;
  }

   /**
   * Get infoMsg
   * @return infoMsg
  **/
  @Schema(description = "")
  public String getInfoMsg() {
    return infoMsg;
  }

  public void setInfoMsg(String infoMsg) {
    this.infoMsg = infoMsg;
  }

  public ProfitLossSuccess timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(example = "29-05-2024 16:14:40", description = "")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public ProfitLossSuccess status(String status) {
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
    ProfitLossSuccess profitLossSuccess = (ProfitLossSuccess) o;
    return Objects.equals(this.code, profitLossSuccess.code) &&
        Objects.equals(this.infoID, profitLossSuccess.infoID) &&
        Objects.equals(this.data, profitLossSuccess.data) &&
        Objects.equals(this.infoMsg, profitLossSuccess.infoMsg) &&
        Objects.equals(this.timestamp, profitLossSuccess.timestamp) &&
        Objects.equals(this.status, profitLossSuccess.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, infoID, data, infoMsg, timestamp, status);
  }


  @Override
  public String toString() {

      return "class ProfitLossSuccess {\n" +
              "    code: " + toIndentedString(code) + "\n" +
              "    infoID: " + toIndentedString(infoID) + "\n" +
              "    data: " + toIndentedString(data) + "\n" +
              "    infoMsg: " + toIndentedString(infoMsg) + "\n" +
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
