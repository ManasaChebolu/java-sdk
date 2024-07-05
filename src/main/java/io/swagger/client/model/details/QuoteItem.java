package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * QuoteItem
 */

public class QuoteItem {
    @SerializedName("exchangeInstrumentID")
    private String exchangeInstrumentID = null;

    @SerializedName("ltp")
    private BigDecimal ltp = null;

    @SerializedName("exchange")
    private String exchange = null;

    public QuoteItem exchangeInstrumentID(String exchangeInstrumentID) {
        this.exchangeInstrumentID = exchangeInstrumentID;
        return this;
    }

    /**
     * Get exchangeInstrumentID
     *
     * @return exchangeInstrumentID
     **/
    @Schema(example = "22", description = "")
    public String getExchangeInstrumentID() {
        return exchangeInstrumentID;
    }

    public void setExchangeInstrumentID(String exchangeInstrumentID) {
        this.exchangeInstrumentID = exchangeInstrumentID;
    }

    public QuoteItem ltp(BigDecimal ltp) {
        this.ltp = ltp;
        return this;
    }

    /**
     * Get ltp
     *
     * @return ltp
     **/
    @Schema(example = "2739", description = "")
    public BigDecimal getLtp() {
        return ltp;
    }

    public void setLtp(BigDecimal ltp) {
        this.ltp = ltp;
    }

    public QuoteItem exchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Get exchange
     *
     * @return exchange
     **/
    @Schema(example = "NSE", description = "")
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuoteItem quoteItem = (QuoteItem) o;
        return Objects.equals(this.exchangeInstrumentID, quoteItem.exchangeInstrumentID) &&
                Objects.equals(this.ltp, quoteItem.ltp) &&
                Objects.equals(this.exchange, quoteItem.exchange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exchangeInstrumentID, ltp, exchange);
    }


    @Override
    public String toString() {

        return "class QuoteItem {\n" +
                "    exchangeInstrumentID: " + toIndentedString(exchangeInstrumentID) + "\n" +
                "    ltp: " + toIndentedString(ltp) + "\n" +
                "    exchange: " + toIndentedString(exchange) + "\n" +
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
