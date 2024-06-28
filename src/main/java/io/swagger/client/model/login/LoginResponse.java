package io.swagger.client.model.login;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * LoginResponse Body
 */

@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-05T10:01:29.776828552Z[GMT]")

public class LoginResponse {
  @SerializedName("infoId")
  private String infoId = null;

  @SerializedName("infoMsg")
  private String infoMsg = null;

  @SerializedName("data")
  private Data data = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  public LoginResponse code(String code) {
    this.infoId = code;
    return this;
  }

   /**
   * Status code
   * @return code
  **/
  @Schema(description = "Status code")
  public String getCode() {
    return infoId;
  }

  public void setCode(String code) {
    this.infoId = code;
  }

  public LoginResponse message(String message) {
    this.infoMsg = message;
    return this;
  }

   /**
   * Message indicating the status of the request
   * @return message
  **/
  @Schema(description = "Message indicating the status of the request")
  public String getMessage() {
    return infoMsg;
  }

  public void setMessage(String message) {
    this.infoMsg = message;
  }

  public LoginResponse data(Data data) {
    this.data = data;
    return this;
  }

   /**
   * Data returned after successful login
   * @return data
  **/
  @Schema(description = "Data returned after successful login")
  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public LoginResponse timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp of the response
   * @return timestamp
  **/
  @Schema(description = "Timestamp of the response")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginResponse inlineResponse200 = (LoginResponse) o;
    return Objects.equals(this.infoId, inlineResponse200.infoId) &&
        Objects.equals(this.infoMsg, inlineResponse200.infoMsg) &&
        Objects.equals(this.data, inlineResponse200.data) &&
        Objects.equals(this.timestamp, inlineResponse200.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infoId, infoMsg, data, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginResponse {\n");
    
    sb.append(" code: ").append(toIndentedString(infoId)).append("\n");
    sb.append(" message: ").append(toIndentedString(infoMsg)).append("\n");
    sb.append(" data: ").append("{").append("\n");
    sb.append("   accessToken: ").append(toIndentedString(data.getAccessToken())).append("\n");
    sb.append(" }").append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return null;
    }
    return o.toString().replace("\n", "\n    ");
  }

}
