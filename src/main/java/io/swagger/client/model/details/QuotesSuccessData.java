package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * QuotesSuccessData
 */

public class QuotesSuccessData {
  @SerializedName("quoteResponse")
  private List<QuoteItem> quoteResponse = null;

  public QuotesSuccessData quoteResponse(List<QuoteItem> quoteResponse) {
    this.quoteResponse = quoteResponse;
    return this;
  }

  public QuotesSuccessData addQuoteResponseItem(QuoteItem quoteResponseItem) {
    if (this.quoteResponse == null) {
      this.quoteResponse = new ArrayList<QuoteItem>();
    }
    this.quoteResponse.add(quoteResponseItem);
    return this;
  }

   /**
   * Get quoteResponse
   * @return quoteResponse
  **/
  @Schema(description = "")
  public List<QuoteItem> getQuoteResponse() {
    return quoteResponse;
  }

  public void setQuoteResponse(List<QuoteItem> quoteResponse) {
    this.quoteResponse = quoteResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotesSuccessData quotesSuccessData = (QuotesSuccessData) o;
    return Objects.equals(this.quoteResponse, quotesSuccessData.quoteResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteResponse);
  }


  @Override
  public String toString() {

      return "class QuotesSuccessData {\n" +
              "    quoteResponse: " + toIndentedString(quoteResponse) + "\n" +
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
