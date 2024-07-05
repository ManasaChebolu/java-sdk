package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PresentDataItem
 */

public class PresentDataItem {
    @SerializedName("data")
    private String data = null;

    @SerializedName("exchangeInstrumentID")
    private String exchangeInstrumentID = null;

    @SerializedName("exchange")
    private String exchange = null;

    public PresentDataItem data(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(example = "1720088940|194.58|194.58|194.58|194.58|4", description = "")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public PresentDataItem exchangeInstrumentID(String exchangeInstrumentID) {
        this.exchangeInstrumentID = exchangeInstrumentID;
        return this;
    }

    /**
     * Get exchangeInstrumentID
     *
     * @return exchangeInstrumentID
     **/
    @Schema(example = "6364", description = "")
    public String getExchangeInstrumentID() {
        return exchangeInstrumentID;
    }

    public void setExchangeInstrumentID(String exchangeInstrumentID) {
        this.exchangeInstrumentID = exchangeInstrumentID;
    }

    public PresentDataItem exchange(String exchange) {
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
        PresentDataItem presentDataItem = (PresentDataItem) o;
        return Objects.equals(this.data, presentDataItem.data) &&
                Objects.equals(this.exchangeInstrumentID, presentDataItem.exchangeInstrumentID) &&
                Objects.equals(this.exchange, presentDataItem.exchange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, exchangeInstrumentID, exchange);
    }


    @Override
    public String toString() {

        return "class PresentDataItem {\n" +
                "    data: " + toIndentedString(data) + "\n" +
                "    exchangeInstrumentID: " + toIndentedString(exchangeInstrumentID) + "\n" +
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
