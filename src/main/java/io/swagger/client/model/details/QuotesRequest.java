package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * QuotesRequest
 */

public class QuotesRequest {
  @SerializedName("data")
  private InstrumentsData data = null;

  public QuotesRequest data(InstrumentsData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public InstrumentsData getData() {
    return data;
  }

  public void setData(InstrumentsData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotesRequest quotesRequest = (QuotesRequest) o;
    return Objects.equals(this.data, quotesRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {

      return "class QuotesRequest {\n" +
              "    data: " + toIndentedString(data) + "\n" +
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
