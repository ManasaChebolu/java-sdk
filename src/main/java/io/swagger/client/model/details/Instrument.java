package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Instrument
 */

public class Instrument {
    @SerializedName("exchange")
    private String exchange = null;

    @SerializedName("exchangeInstrumentID")
    private String exchangeInstrumentID = null;

    public Instrument exchange(String exchange) {
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

    public Instrument exchangeInstrumentID(String exchangeInstrumentID) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Instrument instrument = (Instrument) o;
        return Objects.equals(this.exchange, instrument.exchange) &&
                Objects.equals(this.exchangeInstrumentID, instrument.exchangeInstrumentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exchange, exchangeInstrumentID);
    }


    @Override
    public String toString() {

        return "class Instrument {\n" +
                "    exchange: " + toIndentedString(exchange) + "\n" +
                "    exchangeInstrumentID: " + toIndentedString(exchangeInstrumentID) + "\n" +
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
